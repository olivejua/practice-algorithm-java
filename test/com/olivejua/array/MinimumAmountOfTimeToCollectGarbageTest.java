package com.olivejua.array;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MinimumAmountOfTimeToCollectGarbageTest {
    private final MinimumAmountOfTimeToCollectGarbage problem = new MinimumAmountOfTimeToCollectGarbage();

    @Test
    public void test1() {
        String[] garbage = {"G","P","GP","GG"};
        int[] travel = {2,4,3};

        int result = problem.garbageCollection(garbage, travel);

        assertThat(result).isEqualTo(21);
    }

    @Test
    public void test2() {
        String[] garbage = {"MMM","PGM","GP"};
        int[] travel = {3,10};

        int result = problem.garbageCollection(garbage, travel);

        assertThat(result).isEqualTo(37);
    }
}
