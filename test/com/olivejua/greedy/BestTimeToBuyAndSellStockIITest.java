package com.olivejua.greedy;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import static org.junit.Assert.*;

public class BestTimeToBuyAndSellStockIITest {
    private BestTimeToBuyAndSellStockII problem = new BestTimeToBuyAndSellStockII();

    @Test
    public void test1() {
        int[] prices = {8,1,5,3,6,4};

        int result = problem.maxProfit(prices);

        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    public void test2() {
        int[] prices = {8,1,5,3,6,4};

        int result = problem.maxProfit2(prices);

        Assertions.assertThat(result).isEqualTo(7);
    }

    @Test
    public void test3() {
        int[] prices = {2,1,2,0,1};

        int result = problem.maxProfit(prices);

        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    public void test4() {
        int[] prices = {2,1,2,0,1};

        int result = problem.maxProfit2(prices);

        Assertions.assertThat(result).isEqualTo(2);
    }
}
