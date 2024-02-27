package org.example.MultidementionalDP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockIIITest {
    @Test
    public void testExample1() {
        BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        int expected = 6;
        int result = solution.maxProfit(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();
        int[] prices = {1, 2, 3, 4, 5};
        int expected = 4;
        int result = solution.maxProfit(prices);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        BestTimeToBuyAndSellStockIII solution = new BestTimeToBuyAndSellStockIII();
        int[] prices = {7, 6, 4, 3, 1};
        int expected = 0;
        int result = solution.maxProfit(prices);
        assertEquals(expected, result);
    }

}