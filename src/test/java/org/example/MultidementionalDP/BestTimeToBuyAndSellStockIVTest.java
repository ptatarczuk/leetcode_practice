package org.example.MultidementionalDP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIVTest {
    @Test
    public void testMaxProfitExample1() {
        BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();
        int k = 2;
        int[] prices = {2, 4, 1};
        int expected = 2;
        int result = solution.maxProfit(k, prices);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfitExample2() {
        BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();
        int k = 2;
        int[] prices = {3, 2, 6, 5, 0, 3};
        int expected = 7;
        int result = solution.maxProfit(k, prices);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfitZeroK() {
        BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();
        int k = 0;
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 0;
        int result = solution.maxProfit(k, prices);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfitEmptyPrices() {
        BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();
        int k = 3;
        int[] prices = {};
        int expected = 0;
        int result = solution.maxProfit(k, prices);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfitLargeK() {
        BestTimeToBuyAndSellStockIV solution = new BestTimeToBuyAndSellStockIV();
        int k = 100;
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        int result = solution.maxProfit(k, prices);
        assertEquals(expected, result);
    }

}