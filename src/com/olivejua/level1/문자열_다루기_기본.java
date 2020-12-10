package com.olivejua.level1;

public class 문자열_다루기_기본 {
    public boolean solution(String s) {
        char[] array = s.toCharArray();

        if(!(array.length == 4 || array.length == 6)) {
            return false;
        }

        for(int i=0; i<array.length; i++) {
            if(array[i] < 48 || 57 < array[i]) {
                return false;
            }
        }

        return true;
    }

    public boolean betterSolution(String s) {
        if(s.length() == 4 || s.length() == 6) {
            try {
                int x = Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        else return false;
    }
}
