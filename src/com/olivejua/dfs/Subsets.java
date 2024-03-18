package com.olivejua.dfs;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        dfs(result, nums, 0, new ArrayList<>());

        return result;
    }

    public void dfs(List<List<Integer>> result, int[] numbers, int index, List<Integer> subset) {
        result.add(subset);

        if (numbers.length <= index) {
            return;
        }

        for (int i = index; i < numbers.length; i++) {
            ArrayList<Integer> nextSubset = new ArrayList<>(subset);
            nextSubset.add(numbers[i]);
            dfs(result, numbers, i + 1, nextSubset);
        }
    }
}
