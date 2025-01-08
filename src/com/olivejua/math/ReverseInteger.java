package com.olivejua.math;

import com.olivejua.array.AddBoldTagInString;

import java.util.Arrays;

public class ReverseInteger {

    public int reverse(int x) {
        if (x == Integer.MAX_VALUE || x == Integer.MIN_VALUE) {
            return 0;
        }

        int total = 0;
        int remainder = 0;

        boolean isNegative = x < 0;
        if (isNegative) {
            x = -x;
        }

        int maxV = Integer.MAX_VALUE / 10;
        int maxR = Integer.MAX_VALUE % 10;

        while (x != 0) {
            remainder = x % 10;

            if (maxV < total || (maxV == total && maxR < remainder)) {
                return 0;
            }

            total = total*10 + remainder;
            x = x/10;
        }

        return isNegative ? -total : total;
    }

}
