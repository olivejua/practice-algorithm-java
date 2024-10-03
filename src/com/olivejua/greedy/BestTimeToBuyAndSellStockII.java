package com.olivejua.greedy;

public class BestTimeToBuyAndSellStockII {

    public int maxProfit(int[] prices) {
        int profit = 0;

        boolean buy = false;
        int buyPrice = 0;
        for (int i = 0; i < prices.length-1; i++) {
            //산거있는데 다음에 내리면 이번에 팔기
            if (buy && prices[i] > prices[i+1]) {
                profit += prices[i] - buyPrice;
                buyPrice = 0;
                buy = false;
            } else if (!buy && prices[i] <= prices[i+1]) { //산거 없는데 다음에 올랐으면 사기
                buyPrice = prices[i];
                buy = true;
            }
        }

        // 샀을 때보다 올랐으면 팔기
        if (buy && buyPrice < prices[prices.length-1]) {
            profit += prices[prices.length-1] - buyPrice;
        }

        return profit;
    }

    public int maxProfit2(int[] prices) {
        int result = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i+1]) {
                result += prices[i+1] - prices[i];
            }
        }

        return result;
    }
}
