package com.olivejua.dfs;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;

import java.util.List;

import static com.olivejua.dfs.CollectionComparator.listContainsSameValues;

public class PermutationsTest extends TestCase implements CollectionComparator {
    Permutations sut = new Permutations();

    public void test1() {
        int[] nums = new int[] {1,2,3};
        List<List<Integer>> expectedResult = List.of(
                List.of(1,2,3),
                List.of(1,3,2),
                List.of(2,1,3),
                List.of(2,3,1),
                List.of(3,1,2),
                List.of(3,2,1));

        List<List<Integer>> actualResult = sut.permute(nums);

        // 두 리스트의 크기가 동일한지 확인
        Assertions.assertThat(actualResult.size()).isEqualTo(expectedResult.size());

        // 각 리스트의 크기가 동일하고, 각 리스트에 동일한 정수 값이 포함되어 있는지 확인
        for (List<Integer> actualElementList : actualResult) {
            Assertions.assertThat(listContainsSameValues(expectedResult, actualElementList)).isTrue();
        }
    }

    public void test2() {
        int[] nums = new int[] {0,1};
        List<List<Integer>> expectedResult = List.of(
                List.of(0, 1),
                List.of(1, 0));

        List<List<Integer>> actualResult = sut.permute(nums);

        // 두 리스트의 크기가 동일한지 확인
        Assertions.assertThat(actualResult.size()).isEqualTo(expectedResult.size());

        // 각 리스트의 크기가 동일하고, 각 리스트에 동일한 정수 값이 포함되어 있는지 확인
        for (List<Integer> actualElementList : actualResult) {
            Assertions.assertThat(listContainsSameValues(expectedResult, actualElementList)).isTrue();
        }
    }

    public void test3() {
        int[] nums = new int[] {1};
        List<List<Integer>> expectedResult = List.of(
                List.of(1));

        List<List<Integer>> actualResult = sut.permute(nums);

        // 두 리스트의 크기가 동일한지 확인
        Assertions.assertThat(actualResult.size()).isEqualTo(expectedResult.size());

        // 각 리스트의 크기가 동일하고, 각 리스트에 동일한 정수 값이 포함되어 있는지 확인
        for (List<Integer> actualElementList : actualResult) {
            Assertions.assertThat(listContainsSameValues(expectedResult, actualElementList)).isTrue();
        }
    }

}