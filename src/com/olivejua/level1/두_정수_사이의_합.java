package com.olivejua.level1;

public class 두_정수_사이의_합 {
    public long mySolution(int a, int b) {
        long answer = 0;

        if(a==b) {
            return a;
        }

        while(a < b) {
            answer += a;
            a++;
            if(a==b) answer+=b;
        }

        while(a > b) {
            answer += b;
            b++;
            if(a==b) answer+=a;
        }

        return answer;
    }

    public long betterSolution(int a, int b) {
        return sumAtoB(Math.min(a, b), Math.max(b, a));
    }

    private long sumAtoB(long a, long b) {
        return (b - a + 1) * (a + b) / 2;
    }

    public long betterSolution2(int a, int b) {
        long answer = 0;

        for(int i=Math.min(a, b); i<=Math.max(a, b); i++) {
            answer += i;
        }

        return answer;
    }
}
