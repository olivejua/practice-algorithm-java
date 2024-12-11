package com.olivejua.dfs;

public class RegionCutBySlashes {

    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int size = 4 * n * n; // 각 1x1 정사각형을 4개의 부분으로 나눔
        UnionFind unionFind = new UnionFind(size);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int root = (i * 2 + j) * 4;
                char character = grid[i].charAt(j);

                //top = root + 0
                //right = root + 1
                //bottom = root + 2
                //left = root + 3
                if (character == '/') {
                    //top x left / right x bottom 이 같은 영역
                    unionFind.union(root+0, root+3);
                    unionFind.union(root+1, root+2);
                } else if (character == '\\') {
                    //top x right / bottom x left 가 같은 영역
                    unionFind.union(root+0, root+1);
                    unionFind.union(root+2, root+3);
                } else {
                    //전체를 root와 같은 숫자
                    unionFind.union(root+0, root+1);
                    unionFind.union(root+1, root+2);
                    unionFind.union(root+2, root+3);
                }


                //마주보는 변이 있다면 같이 업데이트해줌
                if (i+1 < n) {
                    unionFind.union(root+2, root+4*n+0);
                }

                if (j+1 < n) {
                    unionFind.union(root+1, root+4+3);
                }

            }
        }

        return unionFind.count;
    }

    static class UnionFind {
        private int[] union;
        private boolean[] changed;
        private int count;

        public UnionFind(int size) {
            union = new int[size];
            changed = new boolean[size];
            count = size;

            for (int i = 0; i < size; i++) {
                union[i] = i;
            }
        }

        public int find(int x) {
            if (union[x] != x) {
                return find(union[x]);
            }

            return union[x];
        }

        private void union(int x1, int x2) {
            // 더 작은 수를 기준으로 업데이트
            int x1Root= find(x1);
            int x2Root= find(x2);

            int unionValue = Math.min(x1Root, x2Root);

            if (x1Root < x2Root) {
                if (!changed[x2]) {
                    union[x2] = unionValue;
                    changed[x2] = true;
                    count--;
                }
            } else {
                if (!changed[x1]) {
                    union[x1] = unionValue;
                    changed[x1] = true;
                    count--;
                }
            }
        }
    }
}
