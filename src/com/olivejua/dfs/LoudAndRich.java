package com.olivejua.dfs;

import java.util.*;

public class LoudAndRich {

    public int[] loudAndRich(int[][] richer, int[] quiet) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] each : richer) {
            List<Integer> lessRiches = graph.getOrDefault(each[1], new ArrayList<>());
            lessRiches.add(each[0]);
            graph.put(each[1], lessRiches);
        }

        if (graph.isEmpty()) {
            int[] result = new int[quiet.length];

            for (int i = 0; i < quiet.length; i++) {
                result[i] = i;
            }

            return result;
        }

        Map<Integer, int[]> visited = new HashMap<>();

        for (int rich = 0; rich < quiet.length; rich++) {
            dfs(graph, rich, visited, quiet);
        }

        int[] result = new int[quiet.length];
        for (Integer rich : visited.keySet()) {
            result[rich] = visited.get(rich)[0];
        }

        return result;
    }

    private int[] dfs(Map<Integer, List<Integer>> graph, int rich, Map<Integer, int[]> visited, int[] quiet) {
        if (visited.containsKey(rich)) {
            return visited.get(rich);
        }

        int[] quietness = new int[] {rich, quiet[rich]};

        if (graph.containsKey(rich)) {
            List<Integer> lessRiches = graph.get(rich);

            for (Integer lessRich : lessRiches) {
                int[] minInLessRich = dfs(graph, lessRich, visited, quiet);

                if (quietness[1] > minInLessRich[1]) {
                    quietness = minInLessRich;
                }
            }
        }

        visited.put(rich, quietness);

        return quietness;
    }
}
