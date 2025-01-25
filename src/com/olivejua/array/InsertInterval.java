package com.olivejua.array;

import java.util.ArrayList;
import java.util.List;

public class InsertInterval {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> result = new ArrayList<>();

        int[] mergeInterval = null;
        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];

            if (newInterval[1] < interval[0] && mergeInterval == null) {
                mergeInterval = newInterval;
                result.add(mergeInterval);
                result.add(interval);
                continue;
            }

            // 현재인터벌의 시작점과 종착점의 범위에 뉴인터벌이 있지 않을 경우 result에 추가
            if (interval[1] < newInterval[0] || newInterval[1] < interval[0]) {
                result.add(interval);
                continue;
            }

            // 그렇지 않을 경우, 현재 인터벌에 뉴인터벌의 시작점이 껴있는경우 시작점을 업데이트
            if (mergeInterval == null) {
                mergeInterval = new int[2];
                mergeInterval[0] = Math.min(interval[0], newInterval[0]);
                mergeInterval[1] = Math.max(interval[1], newInterval[1]);

                result.add(mergeInterval);
            } else {
                mergeInterval[1] = Math.max(interval[1], mergeInterval[1]);
            }
        }

        if (mergeInterval==null) {
            result.add(newInterval);
        }

        return toArrays(result);
    }

    private static int[][] toArrays(List<int[]> list) {
        int[][] array = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            array[i][0] = list.get(i)[0];
            array[i][1] = list.get(i)[1];
        }
        return array;
    }
}
