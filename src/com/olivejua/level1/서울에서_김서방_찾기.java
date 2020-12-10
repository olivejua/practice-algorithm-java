package com.olivejua.level1;

import java.util.Arrays;

public class 서울에서_김서방_찾기 {
    public String solution(String[] seoul) {
        int x = 0;

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                x = i;
                break;
            }
        }

        return "김서방은 " + x + "에 있다";
    }

    public String betterSolution(String[] seoul) {
        int x = Arrays.asList(seoul).indexOf("Kim");

        return "김서방은 " + x + "에 있다";
    }
}
