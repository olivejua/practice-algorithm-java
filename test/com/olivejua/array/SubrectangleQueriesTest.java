package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SubrectangleQueriesTest {
    private SubrectangleQueries problem;

    @Test
    public void test1() {
        int[][] rectangle = {
                {1,2,1},
                {4,3,4},
                {3,2,1},
                {1,1,1}
        };

        problem = new SubrectangleQueries(rectangle);
        assertThat(problem.getValue(0,2)).isEqualTo(1);
        problem.updateSubrectangle(0,0,3,2,5);
        assertThat(problem.getValue(0,2)).isEqualTo(5);
        assertThat(problem.getValue(3,1)).isEqualTo(5);
        problem.updateSubrectangle(3,0,3,2,10);
        assertThat(problem.getValue(3,1)).isEqualTo(10);
        assertThat(problem.getValue(0,2)).isEqualTo(5);
    }
}
