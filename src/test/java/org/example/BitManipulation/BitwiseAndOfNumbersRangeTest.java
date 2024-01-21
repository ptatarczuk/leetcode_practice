package org.example.BitManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BitwiseAndOfNumbersRangeTest {
    @Test
    public void testRangeBitwiseAndExample1() {
        BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();
        int result = solution.rangeBitwiseAnd(5, 7);
        assertEquals(4, result);
    }

    @Test
    public void testRangeBitwiseAndExample2() {
        BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();
        int result = solution.rangeBitwiseAnd(0, 0);
        assertEquals(0, result);
    }

    @Test
    public void testRangeBitwiseAndExample3() {
        BitwiseAndOfNumbersRange solution = new BitwiseAndOfNumbersRange();
        int result = solution.rangeBitwiseAnd(1, 2147483647);
        assertEquals(0, result);
    }
}