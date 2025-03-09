package com.olivejua.sort;

import java.util.*;

public class SortTheStudentsByTheirKthScore {

    public int[][] sortTheStudents(int[][] score, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[k] - a[k]);
        pq.addAll(Arrays.asList(score));

        for (int i = 0; i < score.length; i++) {
            score[i] = pq.poll();
        }

        return score;
    }

    public int[][] sortTheStudents_swap(int[][] score, int k) {
        for (int i = 0; i < score.length-1; i++) {
            int idx = getIndexOfMax(score, i, k);

            if (idx != i) {
                int[] temp = score[i];
                score[i] = score[idx];
                score[idx] = temp;
            }
        }

        return score;
    }

    private int getIndexOfMax(int[][] score, int i, int k) {
        int result = i;

        for (int cur = i+1; cur < score.length; cur++) {
            if (score[cur][k] > score[result][k]) {
                result = cur;
            }
        }

        return result;
    }
}
