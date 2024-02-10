package org.example.OneD_DP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinChangeTest {
    @Test
    public void testExample1() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int expected = 3;
        int result = coinChange.coinChange(coins, amount);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {2};
        int amount = 3;
        int expected = -1;
        int result = coinChange.coinChange(coins, amount);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        CoinChange coinChange = new CoinChange();
        int[] coins = {1};
        int amount = 0;
        int expected = 0;
        int result = coinChange.coinChange(coins, amount);
        assertEquals(expected, result);
    }

}