package com.olivejua.dfs;

import java.util.*;

public class PossibleBipartition {

    public boolean possibleBipartition(int n, int[][] dislikes) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] dislike : dislikes) {
            graph.get(dislike[0]).add(dislike[1]);
            graph.get(dislike[1]).add(dislike[0]);
        }

        int[] colors = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if (colors[i] == 0 && !dfs(graph, colors, i, 1)) {
                return false;
            }
        }

        return true;
    }

    public boolean dfs(List<List<Integer>> graph, int[] colors, int node, int color) {
        colors[node] = color;
        for (int neighbor : graph.get(node)) {
            if (colors[neighbor] == 0) {
                if (!dfs(graph, colors, neighbor, -color)){
                    return false;
                }
            } else if (colors[neighbor] == color) {
                return false;
            }
        }

        return true;
    }
}
