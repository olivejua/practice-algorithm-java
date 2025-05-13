package com.olivejua.dp;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class PascalsTriangleTest {
    private PascalsTriangle problem;

    @Before
    public void setUp() throws Exception {
        problem = new PascalsTriangle();
    }

    @Test
    public void test1() {
        int numRows = 5;

        List<List<Integer>> result = problem.generate(numRows);

        Assertions.assertThat(result).contains(
                List.of(1),
                List.of(1,1),
                List.of(1,2,1),
                List.of(1,3,3,1),
                List.of(1,4,6,4,1)
        );
    }

    @Test
    public void test2() {
        int numRows = 1;

        List<List<Integer>> result = problem.generate(numRows);

        Assertions.assertThat(result).contains(
                List.of(1)
        );
    }
}
