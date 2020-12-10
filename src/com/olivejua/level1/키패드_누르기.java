package com.olivejua.level1;

public class 키패드_누르기 {
    public String solution(int[] numbers, String hand) {
        String answer = "";

        int leftPosition = 10;
        int rightPosition = 12;

         for(int number :  numbers) {
             if(number==0) {
                 number = 11;
             }

             switch (number%3) {
                 case 0 : {
                     answer += "R";
                     rightPosition = number;
                     break;
                 }
                 case 1 : {
                     answer += "L";
                     leftPosition = number;
                     break;
                 }
                 case 2 : {
                     int leftSteps = Math.abs(leftPosition-number) / 3;
                     leftSteps += Math.abs(leftPosition-number) % 3;

                     int rightSteps = Math.abs(rightPosition-number) / 3;
                     rightSteps += Math.abs(rightPosition-number) % 3;

                     if(rightSteps > leftSteps) {
                        answer += "L";
                        leftPosition = number;
                     } else if(rightSteps < leftSteps) {
                         answer += "R";
                         rightPosition = number;
                     } else {
                         if(hand.equals("right")) {
                             answer += "R";
                             rightPosition = number;
                         } else {
                             answer += "L";
                             leftPosition = number;
                         }
                     }
                     break;
                 }
             }
         }

        return answer;
    }
}
