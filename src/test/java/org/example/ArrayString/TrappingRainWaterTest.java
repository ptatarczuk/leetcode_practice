package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrappingRainWaterTest {
    @Test
    public void testExample1() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        int expected = 6;
        int actual = solution.trap(height);
        assertEquals(expected, actual, "Example 1 failed");
    }

    @Test
    public void testExample2() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {4,2,0,3,2,5};
        int expected = 9;
        int actual = solution.trap(height);
        assertEquals(expected, actual, "Example 2 failed");
    }

    @Test
    public void testEmptyArray() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {};
        int expected = 0; // No water can be trapped in an empty array
        int actual = solution.trap(height);
        assertEquals(expected, actual, "Empty array failed");
    }

    @Test
    public void testArrayWithOneElement() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {5};
        int expected = 0; // No water can be trapped with only one element
        int actual = solution.trap(height);
        assertEquals(expected, actual, "Array with one element failed");
    }

    @Test
    public void testArrayWithAllEqualElements() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {3, 3, 3, 3, 3};
        int expected = 0; // No water can be trapped if all elements are equal
        int actual = solution.trap(height);
        assertEquals(expected, actual, "Array with all equal elements failed");
    }

    @Test
    public void testArrayWithDescendingElements() {
        TrappingRainWater solution = new TrappingRainWater();
        int[] height = {5, 4, 3, 2, 1};
        int expected = 0; // No water can be trapped with descending elements
        int actual = solution.trap(height);
        assertEquals(expected, actual, "Array with descending elements failed");
    }

}