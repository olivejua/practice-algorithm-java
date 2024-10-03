package com.olivejua.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> result = new ArrayList<>();

        for (int[] interval : intervals) {
            if (!result.isEmpty() && interval[0] <= result.get(result.size()-1)[1]) {
                result.get(result.size()-1)[1] = Math.max(interval[1], result.get(result.size()-1)[1]);
            } else {
                result.add(interval);
            }
        }

        return result.toArray(new int[result.size()][]);
    }
}

