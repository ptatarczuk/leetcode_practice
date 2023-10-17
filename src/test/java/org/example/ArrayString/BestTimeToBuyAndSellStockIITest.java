package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIITest {
    @Test
    public void testMaxProfitExample1() {
        BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();
        int[] prices = {7, 1, 5, 3, 6, 4};
        int expected = 7;
        int result = solution.maxProfit(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfitExample2() {
        BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        int result = solution.maxProfit(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxProfitExample3() {
        BestTimeToBuyAndSellStockII solution = new BestTimeToBuyAndSellStockII();
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        int result = solution.maxProfit(prices);
        assertEquals(expected, result);
    }

}