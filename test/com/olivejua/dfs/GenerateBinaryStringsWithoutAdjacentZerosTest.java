package com.olivejua.dfs;

import org.junit.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GenerateBinaryStringsWithoutAdjacentZerosTest {
    private final GenerateBinaryStringsWithoutAdjacentZeros problem = new GenerateBinaryStringsWithoutAdjacentZeros();

    @Test
    public void test1() {
        int n = 3;

        List<String> result = problem.validStrings(n);

        assertThat(result).containsExactlyInAnyOrder("111", "110", "011", "101", "010");
    }

    @Test
    public void test2() {
        int n = 1;

        List<String> result = problem.validStrings(n);

        assertThat(result).containsExactlyInAnyOrder("0", "1");
    }

}
