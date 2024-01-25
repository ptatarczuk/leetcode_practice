package org.example.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlusOneTest {

    @Test
    public void testExample1() {
        PlusOne plusOne = new PlusOne();
        int[] input = {1, 2, 3};
        int[] expectedOutput = {1, 2, 4};
        assertArrayEquals(expectedOutput, plusOne.plusOne(input));
    }

    @Test
    public void testExample2() {
        PlusOne plusOne = new PlusOne();
        int[] input = {4, 3, 2, 1};
        int[] expectedOutput = {4, 3, 2, 2};
        assertArrayEquals(expectedOutput, plusOne.plusOne(input));
    }

    @Test
    public void testExample3() {
        PlusOne plusOne = new PlusOne();
        int[] input = {9};
        int[] expectedOutput = {1, 0};
        assertArrayEquals(expectedOutput, plusOne.plusOne(input));
    }

}