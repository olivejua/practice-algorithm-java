package com.olivejua.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 나누어_떨어지는_숫자_배열 {
    public int[] solution(int[] arr, int divisor) {
        //array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로
        //정렬한 배열을 반환하는 함수, solution을 작성해주세요.
        //divisor로 나누어 떨어지는 element가 하나도 없다면 배열을 -1을 담아 반환하세요.

        List<Integer> temp_list = new ArrayList<>();

        for(int num : arr) {
            int restNum = num%divisor;
            if(restNum == 0) {
                temp_list.add(num);
            }
        }

        int[] answer;

        if(0 < temp_list.size()) {
            answer = new int[temp_list.size()];

            for(int i=0; i<temp_list.size(); i++) {
                answer[i] = temp_list.get(i);
            }

            Arrays.sort(answer);
        } else {
            answer = new int[]{-1};
        }

        return answer;
    }

    public int[] divisible(int[] array, int divisor) {
        return Arrays.stream(array).filter(factor -> factor % divisor == 0).toArray();
    }
}
