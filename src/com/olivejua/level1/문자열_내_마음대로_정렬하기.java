package com.olivejua.level1;

import java.util.Arrays;
import java.util.Comparator;

public class 문자열_내_마음대로_정렬하기 {
    public String[] mySolution(String[] strings, int n) {

        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                char c1 = s1.charAt(n);
                char c2 = s2.charAt(n);

                // n번재 문자가 같은 경우에 원본 스트링을 사전순으로
                if(c1 == c2) {
                    return s1.compareTo(s2);
                } else {
                    return c1 - c2;
                }
            }
        });

        return strings;
    }
}
