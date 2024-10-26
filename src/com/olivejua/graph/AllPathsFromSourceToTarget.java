package com.olivejua.graph;

import java.util.*;

public class AllPathsFromSourceToTarget {

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        Map<Integer, List<Integer>> dict = new HashMap<>();
        for (int node = 0; node < graph.length; node++) {
            List<Integer> list = new ArrayList<>();
            for (int nodeCanVisit : graph[node]) {
                list.add(nodeCanVisit);
            }

            dict.put(node, list);
        }

        List<List<Integer>> result = new ArrayList<>();
        dfs(dict, 0, new ArrayList<>(), result, graph.length-1);

        return result;
    }

    void dfs(Map<Integer, List<Integer>> dict, int node, List<Integer> path, List<List<Integer>> result, int dest) {
        if (!dict.containsKey(node)) {
            return;
        }

        path.add(node);

        if (node == dest) {
            result.add(path);
        }

        for (int nextNode : dict.get(node)) {
            dfs(dict, nextNode, new ArrayList<>(path), result, dest);
        }
    }
}
