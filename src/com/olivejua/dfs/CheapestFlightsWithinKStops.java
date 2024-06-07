package com.olivejua.dfs;

import java.sql.SQLIntegrityConstraintViolationException;
import java.util.*;

/**
 * https://leetcode.com/problems/cheapest-flights-within-k-stops
 *
 * for (Map.Entry<Integer, List<Route>> integerListEntry : dic.entrySet()) {
 *             Integer from = integerListEntry.getKey();
 *             List<Route> routes = integerListEntry.getValue();
 *
 *             System.out.printf("from: %d [", from);
 *
 *             for (Route route : routes) {
 *                 System.out.printf("[to: %d, price: %d]", route.to, route.price);
 *             }
 *
 *             System.out.println("]");
 *         }
 */
public class CheapestFlightsWithinKStops {

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, List<Route>> dic = new HashMap<>();
        for (int[] flight : flights) {
            int from = flight[0];
            int to = flight[1];
            int price = flight[2];

            List<Route> routes = dic.getOrDefault(from, new ArrayList<>());
            routes.add(new Route(to, price));
            dic.put(from, routes);
        }

        List<Integer> answers = new ArrayList<>();
        dfs(dic, src, dst, k, 0, 0, answers);
        answers.sort(Comparator.naturalOrder());

        return answers.isEmpty() ? -1 : answers.get(0);
    }

    void dfs(Map<Integer, List<Route>> dic, int from, int dst, int k, int curK, int totalPrice, List<Integer> answers) {
        if (k < curK) {
            return;
        }

        if (!dic.containsKey(from)) {
            return;
        }

        for (Route route : dic.get(from)) {
            if (route.to == dst) {
//                System.out.printf("answers.add(from: %d, to: %d, price: %d)\n", from, route.to, totalPrice + route.price);
                answers.add(totalPrice + route.price);
            } else {
                dfs(dic, route.to, dst, k, curK+1, totalPrice + route.price, answers);
            }
        }
    }

    static class Route {
        int to;
        int price;

        public Route(int to, int price) {
            this.to = to;
            this.price = price;
        }
    }

    public int findCheapestPrice2(int n, int[][] flights, int src, int dst, int k) {
        Map<Integer, Map<Integer, Integer>> graph = new HashMap<>();
        for (int[] flight : flights) {
            graph.putIfAbsent(flight[0], new HashMap<>());
            graph.get(flight[0]).put(flight[1], flight[2]);
        }

        Map<Integer, Integer> visited = new HashMap<>();

        // (도착지, 비용, 진행경로)
        Queue<List<Integer>> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.get(1)));
        pq.add(List.of(src, 0, 0));

        while (!pq.isEmpty()) {
            List<Integer> cur = pq.poll();
            int u = cur.get(0);
            int price_u = cur.get(1);
            int k_visited = cur.get(2);

            if (u == dst) {
                return price_u;
            }

            visited.put(u, k_visited);

            if (k_visited <= k) {
                k_visited += 1;

                if (graph.containsKey(u)) {
                    for (Map.Entry<Integer, Integer> v : graph.get(u).entrySet()) {
                        if (!visited.containsKey(v.getKey()) || k_visited < visited.get(v.getKey())) {
                            int alt = price_u + v.getValue();
                            pq.add(List.of(v.getKey(), alt, k_visited));
                        }
                    }
                }
            }
        }

        return -1;
    }
}
