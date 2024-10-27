package com.olivejua.graph;

public class RedundantConnection2 {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        UnionFind uf = new UnionFind(n + 1);

        for (int[] edge : edges) {
            int vertex1 = edge[0];
            int vertex2 = edge[1];

            // 두 노드가 이미 같은 집합에 있으면, 이 간선이 사이클을 형성하는 마지막 간선
            if (!uf.union(vertex1, vertex2)) {
                return edge;
            }
        }

        return new int[0];
    }

    static class UnionFind {
        private int[] parent;

        public UnionFind(int size) {
            parent = new int[size];
            for (int i = 0; i < size; i++) {
                parent[i] = i;
            }
        }

        public int find(int x) {
            if (parent[x] != x) {
                parent[x] = find(parent[x]); // 경로 압축
            }

            return parent[x];
        }

        public boolean union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);

            if (rootX == rootY) {
                return false; // 사이클 발생
            }

            parent[rootX] = rootY;
            return true;
        }
    }
}
