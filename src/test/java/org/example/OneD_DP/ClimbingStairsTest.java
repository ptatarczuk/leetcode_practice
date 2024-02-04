package org.example.OneD_DP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    @Test
    public void testClimbStairsWithTwoSteps() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int result = climbingStairs.climbStairs(2);
        assertEquals(2, result);
    }

    @Test
    public void testClimbStairsWithThreeSteps() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int result = climbingStairs.climbStairs(3);
        assertEquals(3, result);
    }

    @Test
    public void testClimbStairsWithZeroSteps() {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int result = climbingStairs.climbStairs(0);
        assertEquals(1, result); // There is one way to climb with 0 steps (no steps).
    }
}