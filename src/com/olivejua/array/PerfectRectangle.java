package com.olivejua.array;

import java.util.*;

public class PerfectRectangle {

    public boolean isRectangleCover(int[][] rectangles) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxA = 0;
        int maxB = 0;
        int totalArea = 0;

        for (int[] rectangle : rectangles) {
            int x = rectangle[0];
            int y = rectangle[1];
            int a = rectangle[2];
            int b = rectangle[3];

            minX = Math.min(x, minX);
            minY = Math.min(y, minY);
            maxA = Math.max(a, maxA);
            maxB = Math.max(b, maxB);

            totalArea += ((a - x) * (b - y));
        }

        int hasToBeArea = (maxA - minX) * (maxB - minY);

        if (totalArea != hasToBeArea) {
            return false;
        }

        int[][] plane = new int[maxA-minX][maxB-minY];

        for (int[] rectangle : rectangles) {
            int x = rectangle[0];
            int y = rectangle[1];
            int a = rectangle[2];
            int b = rectangle[3];

            if (!fillThePlane(x-minX, y-minY, a-minX, b-minY, plane)) {
                return false;
            }
        }

        return isFull(minX, minY, maxA, maxB, plane);
    }

    private boolean fillThePlane(int x, int y, int a, int b, int[][] plane) {
        for (int i = x; i < a; i++) {
            for (int j = y; j < b; j++) {
                if (plane[i][j] == 1) {
                    return false;
                }

                plane[i][j] += 1;
            }
        }

        return true;
    }

    private boolean isFull(int x, int y, int a, int b, int[][] plane) {
        for (int i = 0; i < a-x; i++) {
            for (int j = 0; j < b-y; j++) {
                if (plane[i][j] != 1) {
                    return false;
                }
            }
        }

        return true;
    }


    public boolean isRectangleCover2(int[][] rectangles) {
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int totalArea = 0;

        Set<String> points = new HashSet<>();

        for (int[] rectangle : rectangles) {
            int x1 = rectangle[0];
            int y1 = rectangle[1];
            int x2 = rectangle[2];
            int y2 = rectangle[3];

            minX = Math.min(x1, minX);
            minY = Math.min(y1, minY);
            maxX = Math.max(x2, maxX);
            maxY = Math.max(y2, maxY);

            totalArea += ((x2 - x1) * (y2 - y1));

            String[] corners = {
                    x1 + " " + y1,
                    x1 + " " + y2,
                    x2 + " " + y1,
                    x2 + " " + y2
            };

            for (String corner : corners) {
//                points.add(corner);
                if (!points.add(corner)) {
                    points.remove(corner);
                }
            }
            System.out.println();
        }

        int expectedArea = (maxX - minX) * (maxY - minY);
        if (totalArea != expectedArea) {
            return false;
        }

        if (points.size() != 4 ||
                !points.contains(minX + " " + minY) ||
                !points.contains(minX + " " + maxY) ||
                !points.contains(maxX + " " + minY) ||
                !points.contains(maxX + " " + maxY)) {
            return false;
        }

        return true;
    }
}
