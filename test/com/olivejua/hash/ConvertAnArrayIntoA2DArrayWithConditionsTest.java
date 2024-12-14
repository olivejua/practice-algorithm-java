package com.olivejua.hash;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class ConvertAnArrayIntoA2DArrayWithConditionsTest {
    private final ConvertAnArrayIntoA2DArrayWithConditions problem = new ConvertAnArrayIntoA2DArrayWithConditions();

    @Test
    public void test1() {
        int[] nums = {1,3,4,1,2,3,1};

        List<List<Integer>> result = problem.findMatrix(nums);

        assertThat(result.size()).isEqualTo(3);
        assertThat(result).containsExactlyInAnyOrderElementsOf(List.of(
                List.of(1,2,3,4),
                List.of(1,3),
                List.of(1)
        ));
    }

    @Test
    public void test2() {
        int[] nums = {1,2,3,4};

        List<List<Integer>> result = problem.findMatrix(nums);

        assertThat(result.size()).isEqualTo(1);
        assertThat(result).containsExactlyInAnyOrderElementsOf(List.of(
                List.of(1,2,3,4)
        ));
    }
}
