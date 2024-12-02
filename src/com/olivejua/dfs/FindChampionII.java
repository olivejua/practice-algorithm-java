package com.olivejua.dfs;

import java.util.*;

public class FindChampionII {

    public int findChampion2(int n, int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
        }

        if (graph.isEmpty()) {
            return n == 1 ? 0 : -1;
        }

        Set<Integer> visited = new HashSet<>();
        Set<Integer> champions = new HashSet<>();
        for (int a = 0; a < n; a++) {
            if (!visited.contains(a)) {
                dfs(a, graph, visited);
                champions.add(a);
            }
        }

        champions.removeIf(visited::contains);

        return champions.size() == 1 ? champions.iterator().next() : -1;
    }

    private void dfs(int a, Map<Integer, List<Integer>> graph, Set<Integer> visited) {
        if (graph.containsKey(a)) {
            for (Integer b : graph.get(a)) {
                if (!visited.contains(b)) {
                    visited.add(b);
                    dfs(b, graph, visited);
                }
            }
        }
    }

    public int findChampion(int n, int[][] edges) {
        int[] indegree = new int[n];

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            indegree[edge[1]]++;
        }

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        return q.size() == 1 ? q.poll() : -1;
    }
}
