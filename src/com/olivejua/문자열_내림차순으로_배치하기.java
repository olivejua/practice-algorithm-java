package com.olivejua;

import java.util.Arrays;
import java.util.Collections;

public class 문자열_내림차순으로_배치하기 {
    public String solution(String s) {
        Character[] arr = new Character[s.length()];
        for(int i=0; i<arr.length; i++) {
            arr[i] = s.charAt(i);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        String answer = "";
        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }

    public String reverseStr(String str) {
        char[] sol = str.toCharArray();
        Arrays.sort(sol);
        return new StringBuilder(new String(sol)).reverse().toString();
    }
}
