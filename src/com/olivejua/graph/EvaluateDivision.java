package com.olivejua.graph;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvaluateDivision {

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();

        for (int i = 0; i < equations.size(); i++) {
            putEdgesToGraph(equations.get(i), values[i], graph);
        }

        double[] result = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> query = queries.get(i);
            String var1 = query.get(0);
            String var2 = query.get(1);

            if (graph.containsKey(var1) && var1.equals(var2)) {
                result[i] = 1.0;
            } else if (!graph.containsKey(var1) || !graph.get(var1).containsKey(var2)) {
                result[i] = -1.0;
            } else {
                result[i] = truncateToFiveDecimalPlaces(graph.get(var1).get(var2));
            }
        }

        return result;
    }

    void putEdgesToGraph(List<String> vars, double var1ToVar2, Map<String, Map<String, Double>> graph) {
        String var1 = vars.get(0);
        String var2 = vars.get(1);

        if (graph.containsKey(var1) && graph.get(var1).containsKey(var2)) {
            return;
        }

        graph.putIfAbsent(var1, new HashMap<>());
        Map<String, Double> edgesForVar1 = graph.get(var1);
        edgesForVar1.put(var2, var1ToVar2);
        for (Map.Entry<String, Double> entry : edgesForVar1.entrySet()) {
            if (entry.getKey().equals(var2)) {
                continue;
            }

            String var3 = entry.getKey();
            double var3ToVar1 = graph.get(var3).get(var1);

            putEdgesToGraph(List.of(var3, var2), var3ToVar1 * var1ToVar2, graph);
        }

        graph.putIfAbsent(var2, new HashMap<>());
        Map<String, Double> edgesForVar2 = graph.get(var2);
        double var2ToVar1 = 1 / var1ToVar2;
        edgesForVar2.put(var1, var2ToVar1);
        for (Map.Entry<String, Double> entry : edgesForVar2.entrySet()) {
            if (entry.getKey().equals(var1)) {
                return;
            }

            String var3 = entry.getKey();
            double var3ToVar2 = graph.get(var3).get(var2);

            putEdgesToGraph(List.of(var3, var1), var3ToVar2 * var2ToVar1, graph);
        }
    }

    static double truncateToFiveDecimalPlaces(double value) {
        // 소수점 5자리 남기고 버리기
        double scale = Math.pow(10, 5); // 10^5 = 100000
        return Math.round(value * scale) / scale;
    }
}
