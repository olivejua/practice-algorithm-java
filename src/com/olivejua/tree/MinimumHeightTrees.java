package com.olivejua.tree;

import java.util.*;

/**
 * https://leetcode.com/problems/minimum-height-trees/
 */
public class MinimumHeightTrees {

    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 0) {
            return null;
        }


        Map<Integer, List<Integer>> tree = new HashMap<>();

        // tree 만들기
        for (int[] edge : edges) {
            tree.putIfAbsent(edge[0], new ArrayList<>());
            tree.putIfAbsent(edge[1], new ArrayList<>());

            tree.get(edge[0]).add(edge[1]);
            tree.get(edge[1]).add(edge[0]);
        }

        // 루트노드 구하기
        List<Integer> result = new ArrayList<>();

        if (tree.isEmpty()) {
            for (int i = 0; i < n; i++) {
                result.add(i);
            }
        } else {
            while (!tree.isEmpty()) {
                result = removeLeafNodes(tree);
            }
        }

        return result;
    }

    private List<Integer> removeLeafNodes(Map<Integer, List<Integer>> tree) {
        List<Integer> result = new ArrayList<>();

        for(Iterator<Integer> iterator = tree.keySet().iterator(); iterator.hasNext(); ) {
            Integer targetNode = iterator.next();

            if(tree.get(targetNode).size() <= 1) {
                result.add(targetNode);
                iterator.remove();
            }
        }

        //제거된 노드가 리스트로 포함되어있으면 찾아서 제거해줌
        for (List<Integer> connectedNodes : tree.values()) {
            connectedNodes.removeIf(result::contains);
        }

        return result;
    }


    public List<Integer> findMinHeightTrees2(int n, int[][] edges) {
        if (n == 1) {
            return List.of(0);
        }

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int[] edge : edges) {
            graph.putIfAbsent(edge[0], new ArrayList<>());
            graph.putIfAbsent(edge[1], new ArrayList<>());
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        //첫 리프노드 담기
        List<Integer> leaves = new ArrayList<>();
        for (Integer node : graph.keySet()) {
            if (graph.get(node).size() == 1) leaves.add(node);
        }

        //반복문 돌리면서 최종으로 남은 노드 찾기
        while (n > 2) {
            n -= leaves.size();

            List<Integer> newLeaves = new ArrayList<>();
            for (Integer leaf : leaves) {
                Integer neighbor = graph.get(leaf).get(0);
                graph.get(neighbor).remove(leaf);
                if (graph.get(neighbor).size() == 1) newLeaves.add(neighbor);
            }

            leaves = newLeaves;
        }

        return leaves;
    }
}
