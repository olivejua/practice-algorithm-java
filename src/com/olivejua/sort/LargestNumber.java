package com.olivejua.sort;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class LargestNumber {

    public String largestNumber(int[] nums) {
        psudo(nums);

        if (nums[0] == 0) {
            return "0";
        } else {
            return Arrays.toString(nums).replaceAll("\\[|\\]|,|\\s", "");
        }
    }

    void psudo(int[] A) {
        for(int index = 1; index < A.length; index++) {
            int temp = A[index];
            int aux = index-1;

            while(aux >= 0 && toSwap(A[aux], temp)) {
                A[aux+1] = A[aux];
                aux--;
            }

            A[aux+1] = temp;
        }
    }

    public boolean toSwap(int a, int b) {
        String combined1 = String.valueOf(a) + b;
        String combined2 = String.valueOf(b) + a;

        return combined2.compareTo(combined1) > 0;
    }
}
