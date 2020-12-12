package com.olivejua.level1;

//14:16 ~
public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for(int i=0; i<n; i++) {
            char[] arr1_row = this.switchToBinary(arr1[i], n);
            char[] arr2_row = this.switchToBinary(arr2[i], n);

            answer[i] = "";
            for(int j=0; j<n; j++) {
                if(0 < (arr1_row[j]-'0') + (arr2_row[j]-'0')) {
                    answer[i] += "#";
                } else {
                    answer[i] += " ";
                }
            }

        }

        return answer;
    }

    private char[] switchToBinary(int num, int side) {
        String result = "";

        while(2 <= num) {
            result += num%2;
            num = num/2;
        }

        result += num;
        if(result.length() < side) {
            int i = result.length();
            while(i<side) {
                result += 0;
                i++;
            }
        }

        return new StringBuilder(result).reverse().toString().toCharArray();
    }

    public String[] betterSolution(int n, int[] arr1, int[] arr2) {
        String[] result = new String[n];
        System.out.println("=======");
        for (int i = 0; i < n; i++) {
            result[i] = Integer.toBinaryString(arr1[i] | arr2[i]);

            if(i==3) {
                System.out.println("arr1[3] = " + arr1[i]);
                System.out.println("arr2[3] = " + arr2[i]);
                System.out.println("Integer.toBinaryString = " + result[i]);

            }
        }

        for (int i = 0; i < n; i++) {
            result[i] = String.format("%" + n + "s", result[i]);
            if(i==3) {
                System.out.println("result[3] = " + result[i]);
            }
            result[i] = result[i].replaceAll("1", "#");
            result[i] = result[i].replaceAll("0", " ");
        }

        return result;
    }
}
