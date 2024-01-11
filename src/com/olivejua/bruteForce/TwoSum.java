package com.olivejua.bruteForce;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = new int[] {2, 6, 11, 15};
        Integer target = 21;

        TwoSum _this = new TwoSum();
        int[] solution = _this.solution2(numbers, target);
        System.out.println(Arrays.toString(solution));
    }

    // 브루트포스방식으로 풀이
    int[] solution1(int[] numbers, Integer target) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    return new int[] {i, j};
                }
            }
        }

        throw new IllegalArgumentException("Not Found");
    }

    //Map을 이용하여 한번에 조회
    int[] solution2(int[] nums, Integer target) {
        Map<Integer, Integer> numberMap = new HashMap<>();

        //O(n)
        for (int i = 0; i < nums.length; i++) {
            numberMap.put(nums[i], i);
        }

        //O(n)
        for (int i = 0; i < nums.length; i++) {
            int eachNumber = nums[i];
            int findNumber = target - eachNumber;
            if (numberMap.containsKey(findNumber) && numberMap.get(findNumber) != i) {
                return new int[] {i, numberMap.get(findNumber)};
            }
        }

        return null;
    }
}
