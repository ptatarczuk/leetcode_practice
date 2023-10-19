package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {
    @Test
    public void testHIndexExample1() {
        HIndex solution = new HIndex();
        int[] citations = {3, 0, 6, 1, 5};
        int expected = 3;
        int result = solution.hIndex(citations);
        assertEquals(expected, result);
    }

    @Test
    public void testHIndexExample2() {
        HIndex solution = new HIndex();
        int[] citations = {1, 3, 1};
        int expected = 1;
        int result = solution.hIndex(citations);
        assertEquals(expected, result);
    }
}