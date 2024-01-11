package com.olivejua.string;

public class ValidPalindrome20231221 {

    public static void main(String[] args) {
        ValidPalindrome20231221 _this = new ValidPalindrome20231221();

        String input = "Do geese see God?";
        System.out.println(_this.isValidPalindrome(input));
    }

    boolean isValidPalindrome(String input) {
        //문자 또는 숫자만 추출
        char[] targetStr = extractLetterOrDigit(input).toCharArray();
        System.out.println(targetStr);

        //가운데 기준으로 양 옆으로 퍼진다.
        int halfIdx = targetStr.length / 2;

        int point1 = halfIdx - 1;
        int point2 = halfIdx + (targetStr.length % 2);

        while (0 <= point1) {
            if (targetStr[point1--] != targetStr[point2++]) {
                return false;
            }
        }

        return true;
    }

    String extractLetterOrDigit(String originValue) {
        StringBuilder sb = new StringBuilder();
        for (char eachCharacter : originValue.toCharArray()) {
            if (Character.isLetterOrDigit(eachCharacter)) {
                sb.append(Character.toLowerCase(eachCharacter));
            }
        }

        return sb.toString();
    }
}

