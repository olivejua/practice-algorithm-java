package com.olivejua.level1;

public class 가운데_글자_가져오기 {
    public String solution(String s) {
        String answer = "";

        if(s.length()%2 == 1) {
            int index = (s.length()-1)/2;
            answer = s.charAt(index) + "";
        } else {
            int index = s.length()/2;
            answer = s.substring(index-1, index+1);
        }

        return answer;
    }

    public String better_solution(String word) {
        return word.substring((word.length()-1)/2, word.length()/2 +1);
    }
}
