package com.olivejua.divideandconquer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DifferentWaysToAddParentheses {

    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> result = new ArrayList<>();

        if (!containsOperator(expression)) {
            result.add(Integer.valueOf(expression));
            return result;
        }

        for (int i = 0; i < expression.length(); i++) {
            if (isOperator(expression.charAt(i))) {
                List<Integer> a = diffWaysToCompute(expression.substring(0, i));
                List<Integer> b = diffWaysToCompute(expression.substring(i + 1));

                result.addAll(combineAndCompute(a, b, expression.charAt(i)));
            }
        }

        return result;
    }

    private List<Integer> combineAndCompute(List<Integer> a, List<Integer> b, char operator) {
        List<Integer> result = new ArrayList<>();

        for (Integer aN : a) {
            for (Integer bN : b) {
                if (operator == '+') {
                    result.add(aN + bN);
                } else if (operator == '-') {
                    result.add(aN - bN);
                } else if (operator == '*') {
                    result.add(aN * bN);
                }
            }
        }

        return result;
    }

    private boolean isOperator(char character) {
        return character == '+' || character == '-' || character == '*';
    }

    private boolean containsOperator(String expression) {
        return expression.indexOf('+') != -1 ||
                expression.indexOf('-') != -1 ||
                expression.indexOf('*') != -1;
    }

    /**
     * 메모이제이션
     */

    Map<String, List<Integer>> memo = new HashMap<>();
    public List<Integer> diffWaysToCompute_memoization(String expression) {
        if (memo.containsKey(expression)) {
            return  memo.get(expression);
        }

        List<Integer> result = new ArrayList<>();

        if (!containsOperator(expression)) {
            result.add(Integer.valueOf(expression));
            return result;
        }

        for (int i = 0; i < expression.length(); i++) {
            if (isOperator(expression.charAt(i))) {
                List<Integer> a = diffWaysToCompute(expression.substring(0, i));
                List<Integer> b = diffWaysToCompute(expression.substring(i + 1));

                result.addAll(combineAndCompute(a, b, expression.charAt(i)));
            }
        }

        memo.put(expression, result);
        return result;
    }
}
