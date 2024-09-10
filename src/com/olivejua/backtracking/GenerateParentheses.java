package com.olivejua.backtracking;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        dfs(result, "", 0, 0, n);

        return result;
    }

    void dfs(List<String> result, String current, int open, int close, int max) {
        if (open == max && close == max) {
            result.add(current);
            return;
        }

        if (open < close) {
            return;
        }

        if (open < max) {
            dfs(result, current + "(", open+1, close, max);
        }

        if (open > close) {
            dfs(result, current + ")", open, close+1, max);
        }
    }
}
