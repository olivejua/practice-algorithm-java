package com.olivejua.array;

public class QueriesOnNumberOfPointsInsideACircle {

    public int[] countPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int xj = queries[i][0];
            int yj = queries[i][1];
            int rj = queries[i][2];
            int rjSquared = rj * rj;

            for (int[] point : points) {
                int xi = point[0];
                int yi = point[1];

                int distanceSquared = (xi-xj) * (xi-xj) + (yi-yj) * (yi-yj);
                if (distanceSquared <= rjSquared) {
                    result[i]++;
                }
            }
        }

        return result;
    }
}
