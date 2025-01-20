package com.olivejua.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestConsecutiveSequence {
    private final Map<Integer, Integer> union = new HashMap<>();

    public int longestConsecutive2(int[] nums) {
        int result = 0;

        for (int num : nums) {
            int value = num;
            if (union.containsKey(num+1)) {
                value = union.get(num + 1);
            }

            union.put(num, value);
            result = Math.max(result, value-putChildren(value, num)+1);
        }

        return result;
    }

    private int putChildren(int value, int num) {
        if (union.containsKey(num-1)) {
            union.put(num-1, value);

            return putChildren(value, num-1);
        }

        return num;
    }

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        // O(n)
        for (int num : nums) {
            set.add(num);
        }

        int longestStreak = 0;
        for (Integer num : set) {
            if (!set.contains(num-1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (set.contains(currentNum+1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }
}
