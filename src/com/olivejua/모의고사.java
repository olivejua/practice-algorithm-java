package com.olivejua;

import java.util.*;

public class 모의고사 {

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

        List<Integer> list = new ArrayList<>(count.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return count.get(o2).compareTo(count.get(o1));
            }
        });

        int maxScore = count.get(list.get(0));

        list.removeIf(key -> maxScore != count.get(key));

        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public int[] better_solution(int[] answers) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] score = new int[3];

        for(int i=0; i<answers.length; i++) {
            if(answers[i] == a[i%a.length]) {score[0]++;}
            if(answers[i] == b[i%b.length]) {score[1]++;}
            if(answers[i] == c[i%c.length]) {score[2]++;}
        }

        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        ArrayList<Integer> list = new ArrayList<>();
        if(maxScore == score[0]) {list.add(1);}
        if(maxScore == score[1]) {list.add(2);}
        if(maxScore == score[2]) {list.add(3);}
        return list.stream().mapToInt(i->i.intValue()).toArray();
    }
}
