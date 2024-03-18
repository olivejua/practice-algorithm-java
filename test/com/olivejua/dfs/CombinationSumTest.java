package com.olivejua.dfs;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSumTest extends TestCase {
    CombinationSum sut = new CombinationSum();

    public void test1() {
        int[] candidates = {2, 3, 5, 8};
        int target = 8;

        List<List<Integer>> result = sut.combinationSum(candidates, target);

        List<List<Integer>> expected = List.of(
                List.of(2, 2, 2, 2)
                , List.of(2, 3, 3)
                , List.of(3, 5)
                , List.of(8)
        );

        Assertions.assertThat(result.size()).isEqualTo(expected.size());

        for (List<Integer> actualElementList : result) {
            Assertions.assertThat(listContainsSameValues(expected, actualElementList)).isTrue();
        }
    }

    public void test2() {
        int[] candidates = {2,3,5};
        int target = 8;

        List<List<Integer>> expected = List.of(
                List.of(2, 2, 2, 2)
                , List.of(2, 3, 3)
                , List.of(3, 5)
        );

        List<List<Integer>> result = sut.combinationSum(candidates, target);

        Assertions.assertThat(result.size()).isEqualTo(expected.size());

        for (List<Integer> actualElementList : result) {
            Assertions.assertThat(listContainsSameValues(expected, actualElementList)).isTrue();
        }
    }

    public void test3() {
        int[] candidates = {2};
        int target = 1;

        List<List<Integer>> expected = List.of();

        List<List<Integer>> result = sut.combinationSum(candidates, target);

        Assertions.assertThat(result.size()).isEqualTo(expected.size());

        for (List<Integer> actualElementList : result) {
            Assertions.assertThat(listContainsSameValues(expected, actualElementList)).isTrue();
        }
    }

    public void test4() {
        int[] candidates = {8,7,4,3};
        int target = 11;

        List<List<Integer>> expected = List.of(
                List.of(8,3)
                , List.of(7,4)
                , List.of(4,4,3)
        );

        List<List<Integer>> result = sut.combinationSum(candidates, target);

        Assertions.assertThat(result.size()).isEqualTo(expected.size());

        for (List<Integer> actualElementList : result) {
            Assertions.assertThat(listContainsSameValues(expected, actualElementList)).isTrue();
        }
    }

    // 리스트 내부에 동일한 정수 값을 가지고 있는지 확인하는 메소드
    private static boolean listContainsSameValues(List<List<Integer>> lists, List<Integer> targetList) {
        for (List<Integer> list : lists) {
            if (list.size() == targetList.size()) {
                Set<Integer> listSet = new HashSet<>(list);
                Set<Integer> targetSet = new HashSet<>(targetList);
                if (listSet.equals(targetSet)) {
                    return true;
                }
            }
        }
        return false;
    }
}