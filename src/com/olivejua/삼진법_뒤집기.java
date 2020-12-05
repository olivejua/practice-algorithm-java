package com.olivejua;

public class 삼진법_뒤집기 {
    public int solution(int n) {
        int answer = 0;

        StringBuilder switchedNum = new StringBuilder();

        while(3<=n) {
            switchedNum.append(n%3);
            n = n/3;
        }

        switchedNum.append(n).reverse();

        for(int i=0; i<switchedNum.length(); i++) {
            answer += Integer.parseInt(switchedNum.charAt(i)+"")*Math.pow(3, i);
        }

        return answer;
    }
}
