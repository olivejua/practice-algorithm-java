package com.olivejua.dfs;

import java.util.*;

public class MostStonesRemovedWithSameRowOrColumn {

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
                components++;
                dfs(node, rowMap, colMap, visited);
            }
        }

        return stones.length - components;
    }

     private void dfs(String node, Map<Integer, List<Integer>> rowMap, Map<Integer, List<Integer>> colMap, Set<String> visited) {
         String[] parts = node.split(",");
         int row = Integer.parseInt(parts[0]);
         int col = Integer.parseInt(parts[1]);

         visited.add(node);

         for (Integer c : rowMap.getOrDefault(row, new ArrayList<>())) {
             String neighbor = row + "," + c;
             if (!visited.contains(neighbor)) {
                 dfs(neighbor, rowMap, colMap, visited);
             }
         }

         for (Integer r : colMap.getOrDefault(col, new ArrayList<>())) {
             String neighbor = r + "," + col;
             if (!visited.contains(neighbor)) {
                 dfs(neighbor, rowMap, colMap, visited);
             }
         }
     }
}
