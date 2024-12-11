package com.olivejua.dfs;

public class RegionCutBySlashes2 {

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int size = 4 * n * n; // 각 1x1 정사각형을 4개의 부분으로 나눔
        UnionFind uf = new UnionFind(size);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int root = 4 * (i * n + j); // 현재 정사각형의 시작 인덱스
                char val = grid[i].charAt(j);

                // 동일 정사각형 내 연결
                if (val == '/') {
                    uf.union(root + 0, root + 3);
                    uf.union(root + 1, root + 2);
                } else if (val == '\\') {
                    uf.union(root + 0, root + 1);
                    uf.union(root + 2, root + 3);
                } else {
                    uf.union(root + 0, root + 1);
                    uf.union(root + 1, root + 2);
                    uf.union(root + 2, root + 3);
                }

                // 인접 정사각형 연결
                // 아래 정사각형과 연결
                if (i + 1 < n) {
                    int bottom = root + 2;
                    int topOfNext = root + 4 * n + 0;
                    uf.union(bottom, topOfNext);
                }

                // 오른쪽 정사각형과 연결
                if (j + 1 < n) {
                    int right = root + 1;
                    int leftOfNext = root + 4 + 3;
                    uf.union(right, leftOfNext);
                }
            }
        }

        // 서로소 집합에서의 컴포넌트 개수 계산
        return uf.getCount();
    }

    class UnionFind {
        private int[] parent;
        private int[] rank;
        private int count;

        public UnionFind(int size) {
            parent = new int[size];
            rank = new int[size];
            count = size;
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

        public void union(int x, int y) {
            int rootX = find(x);
            int rootY = find(y);
            if (rootX != rootY) {
                if (rank[rootX] > rank[rootY]) {
                    parent[rootY] = rootX;
                } else if (rank[rootX] < rank[rootY]) {
                    parent[rootX] = rootY;
                } else {
                    parent[rootY] = rootX;
                    rank[rootX]++;
                }
                count--;
            }
        }

        public int getCount() {
            return count;
        }
    }
}
