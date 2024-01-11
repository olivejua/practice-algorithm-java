package com.olivejua.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BJ1697 {
    static int subin;
    static int brother;
    static int[] visited = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        String[] inputs = input.split(" ");

        subin = Integer.parseInt(inputs[0]);
        brother = Integer.parseInt(inputs[1]);

        bfs();

        System.out.println(visited[brother]);
    }

    static int bfs() {
        Queue<Integer> q =  new LinkedList<>();
        q.add(subin);
        visited[subin] = 1;

        while(!q.isEmpty()) {
            Integer now = q.poll();

            int next = now + 1;
            if (0 < next && next < visited.length && visited[next] == 0) {
                q.add(next);
                visited[next] = visited[now] + 1;

                if (next == brother) return next;
            }

            next = now - 1;
            if (0 < next && next < visited.length && visited[next] == 0) {
                q.add(next);
                visited[next] = visited[now] + 1;

                if (next == brother) return next;
            }

            next = now * 2;
            if (0 < next && next < visited.length && visited[next] == 0) {
                q.add(next);
                visited[next] = visited[now] + 1;

                if (next == brother) return next;
            }
        }

        return -1;
    }
}
