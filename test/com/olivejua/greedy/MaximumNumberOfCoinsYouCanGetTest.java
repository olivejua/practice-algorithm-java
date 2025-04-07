package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumNumberOfCoinsYouCanGetTest {
    private final MaximumNumberOfCoinsYouCanGet problem = new MaximumNumberOfCoinsYouCanGet();

    @Test
    public void test1() {
        int[] piles = {2,4,1,2,7,8};
        int result = problem.maxCoins2(piles);

        Assertions.assertThat(result).isEqualTo(9);
    }

    @Test
    public void test2() {
        int[] piles = {2,4,5};
        int result = problem.maxCoins(piles);

        Assertions.assertThat(result).isEqualTo(4);
    }

    @Test
    public void test3() {
        int[] piles = {2,4,5};
        int result = problem.maxCoins(piles);

        Assertions.assertThat(result).isEqualTo(4);
    }
}
