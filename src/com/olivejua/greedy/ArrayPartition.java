package com.olivejua.greedy;

import java.util.*;

public class ArrayPartition {
    int max = Integer.MIN_VALUE;

    public int arrayPairSum(int[] nums) {
        int sum = 0;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i+=2) {
            sum += nums[i];
        }

        return sum;
    }

    public int arrayPairSum2(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        Arrays.stream(nums).forEach(numbers::add);

        dfs(numbers, new HashSet<>(), 0);

        return max;
    }

    void dfs(List<Integer> numbers, Set<Integer> ignoreIdxes, int sum) {
        if (numbers.size() == ignoreIdxes.size()) {
            max = Math.max(max, sum);
            return;
        }

        int a = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (!ignoreIdxes.contains(i)) {
                a = i;
                ignoreIdxes.add(a);
                break;
            }
        }

        for (int b = a+1; b < numbers.size(); b++) {
            if (ignoreIdxes.contains(b)) {
                continue;
            }

            ignoreIdxes.add(b);
            int pairMin = Math.min(numbers.get(a), numbers.get(b));

            dfs(numbers, ignoreIdxes, sum + pairMin);

            ignoreIdxes.remove(b);
        }

        ignoreIdxes.remove(a);
    }
}
