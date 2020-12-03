package com.olivejua;

import java.util.ArrayList;
import java.util.Arrays;

public class 두개뽑아서더하기 {

    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};

        System.out.println(Arrays.toString(solution2(numbers)));
    }

    public static int[] solution1(int[] numbers) {

        int[] answer = new int[100];

        Arrays.sort(numbers);

        int cnt = 0;
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                int addedNumber = numbers[i]+numbers[j];

                if(2 <= addedNumber && addedNumber <= 100) {
                    if(0 > Arrays.binarySearch(answer, addedNumber)) {
                        answer[cnt++] = addedNumber;
                        Arrays.sort(answer);
                    }
                }
            }
        }

        for(int i=0; i<answer.length; i++) {
            if(0 < answer[i]) {
                 answer = Arrays.copyOfRange(answer, i, answer.length);
                break;
            }
        }

        return answer;
    }

    public static int[] solution2(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i<numbers.length-1; i++) {
            for(int j=i+1; j< numbers.length; j++) {
                int addedNumber = numbers[i] + numbers[j];

                if(list.indexOf(addedNumber) < 0) {
                    list.add(addedNumber);
                }
            }
        }

        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }

        Arrays.sort(answer);

        return answer;
    }
}
