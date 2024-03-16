package com.olivejua.dfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        List<Integer> numbers = Arrays.stream(nums)
                .boxed()
                .toList();

        dfs(result, new ArrayList<>(), numbers);

        return result;
    }

    void dfs(List<List<Integer>> result, List<Integer> permutation, List<Integer> numbers) {
        if (numbers.isEmpty()) {
            result.add(permutation);
            return;
        }

        for (int i = 0; i < numbers.size(); i++) {
            Integer number = numbers.get(i);

            List<Integer> nextPermutation = new ArrayList<>(permutation);
            nextPermutation.add(number);

            ArrayList<Integer> nextNumbers = new ArrayList<>(numbers);
            nextNumbers.remove(number);

            dfs(result, nextPermutation, nextNumbers);
        }
    }
}
