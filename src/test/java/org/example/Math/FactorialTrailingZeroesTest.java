package org.example.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTrailingZeroesTest {

    @Test
    public void testTrailingZeroesForThree() {
        FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        int result = solution.trailingZeroes(3);
        assertEquals(0, result);
    }

    @Test
    public void testTrailingZeroesForFive() {
        FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        int result = solution.trailingZeroes(5);
        assertEquals(1, result);
    }

    @Test
    public void testTrailingZeroesForZero() {
        FactorialTrailingZeroes solution = new FactorialTrailingZeroes();
        int result = solution.trailingZeroes(0);
        assertEquals(0, result);
    }
}