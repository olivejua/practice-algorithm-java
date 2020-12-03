package com.olivejua;

import java.util.Arrays;

public class K번째_수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int select = commands[i][2];

            int[] tempArr = Arrays.copyOfRange(array, start-1, end);
            Arrays.sort(tempArr);
            answer[i] = tempArr[select-1];
        }

        System.out.println(Arrays.toString(answer));

        return answer;
    }

    public int[] better_solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i=0; i<commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2]-1];
        }

        return answer;
    }
}
