package com.olivejua.graph;

import java.util.*;

public class RedundantConnection {

    public int[] findRedundantConnection(int[][] edges) {
        Map<Integer, List<Integer>> graph = new HashMap<>();

        for (int[] edge : edges) {
            int vertex1 = edge[0];
            int vertex2 = edge[1];
            graph.putIfAbsent(vertex1, new ArrayList<>());
            graph.putIfAbsent(vertex2, new ArrayList<>());
            graph.get(vertex1).add(vertex2);
            graph.get(vertex2).add(vertex1);
        }

        if (!graph.containsKey(1)) {
            return new int[0];
        }

        //간선이 딱 하나인 정점은 지우면 안됨
        List<Integer> verticesCannotRemoved = new ArrayList<>();
        List<Integer> verticesCanRemoved = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : graph.entrySet()) {
            if (entry.getValue().size() == 1) {
                verticesCannotRemoved.add(entry.getKey());
                continue;
            }

            dfs(graph, entry.getKey(), 0, new ArrayList<>(), verticesCanRemoved);
        }

        int[] result = null;
        for (int i = edges.length-1; i >= 0; i--) {
            if (verticesCannotRemoved.contains(edges[i][0]) || verticesCannotRemoved.contains(edges[i][1])) {
                continue;
            }

            if (verticesCanRemoved.contains(edges[i][0]) || verticesCanRemoved.contains(edges[i][1])) {
                result = edges[i];
                break;
            }
        }

        return result;
    }

    void dfs(Map<Integer, List<Integer>> graph, int vertex, int prevVertex, List<Integer> path, List<Integer> verticesCanRemoved) {
        if (path.contains(vertex)) {
            if (!verticesCanRemoved.contains(path.get(path.size()-1))) {
                verticesCanRemoved.add(path.get(path.size()-1));
            }
            System.out.println(Arrays.toString(path.toArray()) + ", " + vertex);
            return;
        }

        path.add(vertex);

        if (graph.get(vertex).isEmpty() || (graph.get(vertex).size() == 1 && graph.get(vertex).get(0) == prevVertex)) {
            System.out.println(Arrays.toString(path.toArray()));
        }

        for (int connectedVertex : graph.get(vertex)) {
            if (prevVertex != connectedVertex) {
                dfs(graph, connectedVertex, vertex, path, verticesCanRemoved);
            }
        }

        path.remove(path.size()-1);
    }
}
