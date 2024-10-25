package com.olivejua.graph;

import java.util.*;

public class EvaluateDivision {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            List<String> equation = equations.get(i);
            String var1 = equation.get(0);
            String var2 = equation.get(1);
            double var1ToVar2 = values[i];

            graph.putIfAbsent(var1, new HashMap<>());
            graph.get(var1).put(var2, var1ToVar2);

            graph.putIfAbsent(var2, new HashMap<>());
            graph.get(var2).put(var1, 1/var1ToVar2);
        }

        double[] result = new double[queries.size()];

        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String from = query.get(0);
            String to = query.get(1);

            if (!graph.containsKey(from) || !graph.containsKey(to)) {
                result[i] = -1;
            } else {
                List<String> visited = new ArrayList<>();
                double answer = edgeNumber(graph, from, to, 1.0, visited);
                result[i] = truncateToFiveDecimalPlaces(answer);
            }
        }

        return result;
    }

    private double edgeNumber(Map<String, Map<String, Double>> graph, String currentLocation, String destination, double value, List<String> visited) {
        if (visited.contains(currentLocation)) {
            return -1;
        }

        visited.add(currentLocation);
        if (currentLocation.equals(destination)) {
            return value;
        }

        for (Map.Entry<String, Double> each : graph.get(currentLocation).entrySet()) {
            double answer = edgeNumber(graph, each.getKey(), destination, value * each.getValue(), new ArrayList<>(visited));

            if (answer != -1) {
                return answer;
            }
        }

        return -1;
    }

    static double truncateToFiveDecimalPlaces(double value) {
        // 소수점 5자리 남기고 버리기
        double scale = Math.pow(10, 5); // 10^5 = 100000
        return Math.round(value * scale) / scale;
    }
}
