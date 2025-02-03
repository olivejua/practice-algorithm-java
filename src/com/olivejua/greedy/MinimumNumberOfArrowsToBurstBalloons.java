package com.olivejua.greedy;

import java.util.*;

public class MinimumNumberOfArrowsToBurstBalloons {

    public int findMinArrowShots1(int[][] points) {
        if (points.length == 0) {
            return 0;
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[0] != b[0]) {
                return a[0] < b[0] ? -1 : 1;
            }

            if (a[1] != b[1]) {
                return a[1] < b[1] ? -1 : 1;
            }

            return 0;
        });
        pq.addAll(Arrays.asList(points));

        int[] cur = pq.poll();
        int shot = cur[0];
        int scope = cur[1];
        int arrows = 1;

        while (!pq.isEmpty()) {
            cur = pq.poll();

            if (cur[0] <= scope) {
                shot = Math.max(shot, cur[0]);
                scope = Math.min(scope, cur[1]);

                continue;
            }

            shot = cur[0];
            scope = cur[1];
            arrows++;
        }

        return arrows;
    }

    public int findMinArrowShots(int[][] points) {
        int arrows = 0;

        if (points.length == 0) {
            return arrows;
        }

        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int shot = points[0][1];
        arrows++;

        for (int i = 1; i < points.length; i++) {
            if (shot < points[i][0]) {
                shot = points[i][1];
                arrows++;
            }
        }

        return arrows;
    }
}
