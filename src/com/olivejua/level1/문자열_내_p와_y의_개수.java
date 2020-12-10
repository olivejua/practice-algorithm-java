package com.olivejua.level1;

public class 문자열_내_p와_y의_개수 {
    boolean solution(String s) {
        int p_size = 0;
        int y_size = 0;

        for(int i=0; i<s.length(); i++) {
            String temp = s.charAt(i) + "";

            if(temp.equalsIgnoreCase("p")) {
                p_size++;
            } else if(temp.equalsIgnoreCase("y")) {
                y_size++;
            }
        }

        return p_size == y_size;
    }

    boolean betterSolution(String s) {
        s = s.toUpperCase();

        return s.chars().filter(e -> 'P' == e).count() == s.chars().filter(e -> 'Y' == e).count();
    }
}
