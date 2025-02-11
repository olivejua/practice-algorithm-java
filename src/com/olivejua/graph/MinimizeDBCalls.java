package com.olivejua.graph;

import org.assertj.core.internal.bytebuddy.agent.builder.AgentBuilder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MinimizeDBCalls {

    public static int minimizeTime(int N, int M, int[] servers, int[][] pairs) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 그래프 생성 (Undirected Graph)
        for (int[] pair : pairs) {
            int u = pair[0];
            int v = pair[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[N + 1];
        int totalCost = 0;

        // 모든 요청을 탐색하면서 연결된 구성 요소 찾기
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                totalCost += bfs(i, graph, visited, servers);
            }
        }

        return totalCost;
    }

    private static int bfs(int start, List<List<Integer>> graph, boolean[] visited, int[] servers) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        int count1 = 0, count2 = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            if (servers[node - 1] == 1) {
                count1++;
            } else {
                count2++;
            }

            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }

        // 비용 계산 (더 작은 그룹을 재배치하는 비용 vs. DB 호출 비용)
        int minCost = Math.min(count1, count2);
        return minCost;
    }

    public static void main(String[] args) {
        // Sample Input 3
        int N = 6;
        int M = 6;
        int[] servers = {1, 1, 1, 2, 2, 2};
        int[][] pairs = {
                {1, 2},
                {2, 3},
                {4, 5},
                {5, 6},
                {1, 4},
                {2, 5}
        };

        System.out.println(minimizeTime(N, M, servers, pairs)); // Output: 2
    }
}
