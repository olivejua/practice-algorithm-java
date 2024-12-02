package com.olivejua.greedy;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {

    public int minPartitions(String n) {
        int max = 0;

        for (char ch : n.toCharArray()) {
            int num = ch - '0';

            max = Math.max(max, num);

            if (max == 9) {
                break;
            }
        }

        return max;
    }
}
