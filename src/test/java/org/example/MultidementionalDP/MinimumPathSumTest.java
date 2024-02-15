package org.example.MultidementionalDP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {
    @Test
    public void testExample1() {
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        int[][] grid = {{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int result = minimumPathSum.minPathSum(grid);
        assertEquals(7, result);
    }

    @Test
    public void testExample2() {
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        int[][] grid = {{1, 2, 3}, {4, 5, 6}};
        int result = minimumPathSum.minPathSum(grid);
        assertEquals(12, result);
    }

    @Test
    public void testEmptyGrid() {
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        int[][] grid = {};
        int result = minimumPathSum.minPathSum(grid);
        assertEquals(0, result);
    }

    @Test
    public void testSingleElementGrid() {
        MinimumPathSum minimumPathSum = new MinimumPathSum();
        int[][] grid = {{5}};
        int result = minimumPathSum.minPathSum(grid);
        assertEquals(5, result);
    }

}