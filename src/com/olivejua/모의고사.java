package com.olivejua;

import java.util.*;

public class 모의고사 {

    public static void main(String[] args) {
        모의고사 _this = new 모의고사();

//        int[] answers = {1,3,2,4,2};
        int[] answers = {1,2,3,4,5};
        System.out.println(Arrays.toString(_this.solution(answers)));
    }

    public int[] solution(int[] answers) {
        int[] answer1 = {1, 2, 3, 4, 5};
        int[] answer2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] answer3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        HashMap<Integer, Integer> count = new HashMap<>();

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == answer1[i%5]) {
                count.put(1, count.getOrDefault(1, 0)+1);
            }

            if(answers[i] == answer2[i%8]) {
                count.put(2, count.getOrDefault(2, 0)+1);
            }

            if(answers[i] == answer3[i%10]) {
                count.put(3, count.getOrDefault(3, 0)+1);
            }
        }

        System.out.println("count: " + count);

        List<Integer> list = new ArrayList<>(count.keySet());
        Collections.sort(list, (Comparator.comparing(count::get)));

        System.out.println("고득점자순: " + list);

        int[] answer = new int[list.size()];
        int cnt=0;
        for(Integer key : list) {
            answer[cnt++] = key;
        }

        return answer;
    }
}
