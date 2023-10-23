package org.example.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainerWithMostWaterTest {
    @Test
    public void testMaxArea() {
        ContainerWithMostWater container = new ContainerWithMostWater();

        // Test case 1: Regular case with varying heights
        int[] heights1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int expected1 = 49;  // The maximum area is 7 (height) * 7 (width)
        assertEquals(expected1, container.maxArea(heights1));

        // Test case 2: All heights are the same
        int[] heights2 = {5, 5, 5, 5, 5, 5, 5, 5, 5};
        int expected2 = 40;  // The maximum area is 5 (height) * 8 (width)
        assertEquals(expected2, container.maxArea(heights2));

        // Test case 3: Heights in descending order
        int[] heights3 = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int expected3 = 20;  // The maximum area is 9 (height) * 2 (width)
        assertEquals(expected3, container.maxArea(heights3));

        // Test case 4: Heights in ascending order
        int[] heights4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int expected4 = 20;  // The maximum area is 9 (height) * 2 (width)
        assertEquals(expected4, container.maxArea(heights4));

        // Test case 5: Empty array
        int[] heights5 = {};
        int expected5 = 0;  // No containers can be formed
        assertEquals(expected5, container.maxArea(heights5));

        // Test case 6: Single-element array
        int[] heights6 = {10};
        int expected6 = 0;  // No containers can be formed
        assertEquals(expected6, container.maxArea(heights6));
    }

}