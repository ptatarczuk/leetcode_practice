package org.example.Intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumNumberOfArrowsTest {
    @Test
    public void testExample1() {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        int expected = 2;
        MinimumNumberOfArrows solver = new MinimumNumberOfArrows(); // Replace with the actual class name
        int result = solver.findMinArrowShots(points);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        int[][] points = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};
        int expected = 4;
        MinimumNumberOfArrows solver = new MinimumNumberOfArrows(); // Replace with the actual class name
        int result = solver.findMinArrowShots(points);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        int[][] points = {{1, 2}, {2, 3}, {3, 4}, {4, 5}};
        int expected = 2;
        MinimumNumberOfArrows solver = new MinimumNumberOfArrows(); // Replace with the actual class name
        int result = solver.findMinArrowShots(points);
        assertEquals(expected, result);
    }
}