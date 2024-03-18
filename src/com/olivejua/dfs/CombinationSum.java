package com.olivejua.dfs;

import java.util.*;

/**
 * https://leetcode.com/problems/combination-sum
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);

        List<List<Integer>> result = new ArrayList<>();

//        dfs(result, new ArrayList<>(), candidates, target);
        dfs(result, candidates, target, 0, new ArrayDeque<>());

        return result;
    }

//    public void dfs(List<List<Integer>> result, List<Integer> combination, int[] candidates, int target) {
//        int sum = combination.stream()
//                .mapToInt(Integer::intValue)
//                .sum();
//
//        if (sum > target) {
//            return;
//        }
//
//        if (sum == target) {
//            result.add(combination);
//            return;
//        }
//
//        for (int candidate : candidates) {
//            if (!combination.isEmpty() && combination.get(combination.size()-1) > candidate) {
//                continue;
//            }
//
//            ArrayList<Integer> nextCombinations = new ArrayList<>(combination);
//            nextCombinations.add(candidate);
//            dfs(result, nextCombinations, candidates, target);
//            if (sum + candidate >= target) {
//                break;
//            }
//        }
//    }

    public void dfs(List<List<Integer>> result, int[] candidates, int target, int index, Deque<Integer> path) {
        if (target < 0) {
            return;
        }

        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            path.addLast(candidates[i]);
            dfs(result, candidates, target - candidates[i], i, path);
            path.removeLast();
        }
    }
}
