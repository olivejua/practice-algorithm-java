package com.olivejua.greedy;

import java.util.Arrays;

public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int result = 0;

        int cookie = 0;
        for (int i = 0; i < g.length; i++) {
            int j = cookie;
            while (j < s.length) {
                if (g[i] <= s[j]) {
                    result++;
                    cookie = j + 1;
                    break;
                }

                j++;
            }
        }

        return result;
    }
}
