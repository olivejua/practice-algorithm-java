package com.olivejua.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 미로탐색
 * <a href="https://www.acmicpc.net/problem/2178">...</a>
 */
public class BJ2178 {
    static int[][] map;
    static boolean[][] visited;
    static int n;
    static int m;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        map = new int[n][m];
        for(int i = 0; i< n; i++) {
            String s = br.readLine();
            for(int j = 0; j< m; j++) {
                map[i][j] = s.charAt(j) - '0';
            }
        }

        visited = new boolean[n][m];
        visited[0][0] = true;

        bfs(0, 0);
        System.out.println(map[n-1][m-1]);
    }

    public static void bfs(int x, int y) {
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(x, y));

        while(!q.isEmpty()) {
            Node now = q.poll();

            for (int i = 0; i < 4; i++) {
                Node next = new Node(now.x + dx[i], now.y + dy[i]);

                if (next.x < 0 || next.y < 0 || next.x >= n || next.y >= m) {
                    continue;
                }
                if (visited[next.x][next.y] || map[next.x][next.y] == 0) {
                    continue;
                }

                q.add(next);
                map[next.x][next.y] = map[now.x][now.y] + 1;
                visited[next.x][next.y] = true;
            }
        }
    }

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
