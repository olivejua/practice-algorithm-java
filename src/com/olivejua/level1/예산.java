package com.olivejua.level1;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        int limit = 0;
        for(int i=0; i<d.length; i++) {
            if(limit + d[i] <= budget) {
                limit += d[i];
                answer++;
            } else {
                break;
            }
        }

        return answer;
    }

    public int betterSolution(int[] d, int budget) {
        int answer = 0;

        Arrays.sort(d);

        for(int i=0; i<d.length; i++) {
            budget -= d[i];
            if(budget < 0) break;

            answer++;
        }

        return answer;
    }
}
