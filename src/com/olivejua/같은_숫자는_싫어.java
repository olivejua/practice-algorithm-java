package com.olivejua;

import java.util.ArrayList;
import java.util.List;

public class 같은_숫자는_싫어 {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<arr.length-1; i++) {
            if(arr[i] != arr[i+1]) {
                answer.add(arr[i]);
            }
        }

        answer.add(arr[arr.length-1]);

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] better_solution(int[] arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num) {
                tempList.add(num);
            }

            preNum = num;
        }

        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }

        return answer;
    }
}
