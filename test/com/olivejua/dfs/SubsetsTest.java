package com.olivejua.dfs;

import junit.framework.TestCase;
import org.assertj.core.api.Assertions;

import java.util.List;

import static com.olivejua.dfs.CollectionComparator.listContainsSameValues;

public class SubsetsTest extends TestCase {
    Subsets newInstance = new Subsets();

    public void test1() {
        int[] nums = {1,2,3};
        List<List<Integer>> expected = List.of(
                List.of()
                , List.of(1)
                , List.of(2)
                , List.of(1,2)
                , List.of(3)
                , List.of(1,3)
                , List.of(2,3)
                , List.of(1,2,3)
        );

        List<List<Integer>> result = newInstance.subsets(nums);

        Assertions.assertThat(result.size()).isEqualTo(expected.size());

        for (List<Integer> actualElementList : result) {
            Assertions.assertThat(listContainsSameValues(result, actualElementList)).isTrue();
        }
    }

    public void test2() {
        int[] nums = {0};
        List<List<Integer>> expected = List.of(
                List.of()
                , List.of(0)
        );

        List<List<Integer>> result = newInstance.subsets(nums);

        Assertions.assertThat(result.size()).isEqualTo(expected.size());

        for (List<Integer> actualElementList : result) {
            Assertions.assertThat(listContainsSameValues(result, actualElementList)).isTrue();
        }
    }
}