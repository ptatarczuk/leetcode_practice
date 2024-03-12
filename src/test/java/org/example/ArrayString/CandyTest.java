package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CandyTest {
    @Test
    public void testCandyExample1() {
        Candy candySolver = new Candy();
        int[] ratings = {1, 0, 2};
        int expected = 5;
        int result = candySolver.candy(ratings);
        assertEquals(expected, result, "Test case 1 failed");
    }

    @Test
    public void testCandyExample2() {
        Candy candySolver = new Candy();
        int[] ratings = {1, 2, 2};
        int expected = 4;
        int result = candySolver.candy(ratings);
        assertEquals(expected, result, "Test case 2 failed");
    }

    @Test
    public void testCandyEmptyInput() {
        Candy candySolver = new Candy();
        int[] ratings = {};
        int expected = 0;
        int result = candySolver.candy(ratings);
        assertEquals(expected, result, "Test case 3 failed");
    }

    @Test
    public void testCandySingleElementInput() {
        Candy candySolver = new Candy();
        int[] ratings = {5};
        int expected = 1;
        int result = candySolver.candy(ratings);
        assertEquals(expected, result, "Test case 4 failed");
    }

    @Test
    public void testCandyAllEqualRatings() {
        Candy candySolver = new Candy();
        int[] ratings = {3, 3, 3, 3};
        int expected = 4;
        int result = candySolver.candy(ratings);
        assertEquals(expected, result, "Test case 5 failed");
    }

}