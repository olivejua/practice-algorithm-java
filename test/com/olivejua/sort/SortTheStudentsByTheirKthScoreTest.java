package com.olivejua.sort;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class SortTheStudentsByTheirKthScoreTest {
    private final SortTheStudentsByTheirKthScore problem = new SortTheStudentsByTheirKthScore();

    @Test
    public void test1() {
        int[][] score = {
                {10,6,9,1},
                {7,5,11,2},
                {4,8,3,15}
        };

        int k = 2;

        int[][] result = problem.sortTheStudents_swap(score, k);

        assertThat(result[0]).containsExactly(7,5,11,2);
        assertThat(result[1]).containsExactly(10,6,9,1);
        assertThat(result[2]).containsExactly(4,8,3,15);
    }

    @Test
    public void test2() {
        int[][] score = {
                {3,4},
                {5,6}
        };

        int k = 0;

        int[][] result = problem.sortTheStudents_swap(score, k);

        assertThat(result[0]).containsExactly(5,6);
        assertThat(result[1]).containsExactly(3,4);
    }
}
