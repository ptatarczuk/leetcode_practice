package org.example.MultidementionalDP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UniquePathsIITest {
    @Test
    public void testUniquePathsWithObstaclesExample1() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int expected = 2;
        int result = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, result);
    }

    @Test
    public void testUniquePathsWithObstaclesExample2() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] obstacleGrid = {{0, 1}, {0, 0}};
        int expected = 1;
        int result = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, result);
    }

    @Test
    public void testUniquePathsWithObstaclesNoObstacles() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] obstacleGrid = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expected = 6; // 3x3 grid with no obstacles
        int result = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, result);
    }

    @Test
    public void testUniquePathsWithObstaclesBlockedStart() {
        UniquePathsII uniquePathsII = new UniquePathsII();
        int[][] obstacleGrid = {{1, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int expected = 0; // Starting point is blocked
        int result = uniquePathsII.uniquePathsWithObstacles(obstacleGrid);
        assertEquals(expected, result);
    }
}