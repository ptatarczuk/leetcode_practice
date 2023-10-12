package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {
    @Test
    public void testMaxProfit() {
        BestTimeToBuyAndSellStock stockAnalyzer = new BestTimeToBuyAndSellStock();

        // Test case 1
        int[] prices1 = {7, 1, 5, 3, 6, 4};
        int expected1 = 5;
        int actual1 = stockAnalyzer.maxProfit(prices1);
        assertEquals(expected1, actual1);

        // Test case 2
        int[] prices2 = {7, 6, 4, 3, 1};
        int expected2 = 0;
        int actual2 = stockAnalyzer.maxProfit(prices2);
        assertEquals(expected2, actual2);
    }
}