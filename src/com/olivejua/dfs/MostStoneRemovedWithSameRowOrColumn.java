package com.olivejua.dfs;

import java.util.*;

public class MostStoneRemovedWithSameRowOrColumn {

    public int removeStones(int[][] stones) {
        Map<Integer, List<Integer>> rowMap = new HashMap<>();
        Map<Integer, List<Integer>> colMap = new HashMap<>();

        for (int[] stone : stones) {
            rowMap.computeIfAbsent(stone[0], k -> new ArrayList<>()).add(stone[1]);
            colMap.computeIfAbsent(stone[1], k -> new ArrayList<>()).add(stone[0]);
        }

        Set<String> visited = new HashSet<>();

        int components = 0;
        for (int[] stone : stones) {
            String node = stone[0] + "," + stone[1];

            if (!visited.contains(node)) {
                dfs(node, rowMap, colMap, visited);
                components++;
            }
        }

        return stones.length - components;
    }

    private void dfs(String node, Map<Integer, List<Integer>> rowMap, Map<Integer, List<Integer>> colMap, Set<String> visited) {
        visited.add(node);

        String[] parts = node.split(",");
        int x = Integer.parseInt(parts[0]);
        int y = Integer.parseInt(parts[1]);

        for (Integer col : rowMap.get(x)) {
            String neighbor = x + "," + col;
            if (!visited.contains(neighbor)) {
                dfs(neighbor, rowMap, colMap, visited);
            }
        }

        for (Integer row : colMap.get(y)) {
            String neighbor = row + "," + y;
            if (!visited.contains(neighbor)) {
                dfs(neighbor, rowMap, colMap, visited);
            }
        }
    }
}
