package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameTest {

    @Test
    public void testCanJumpExample1() {
        JumpGame solution = new JumpGame();
        int[] nums = {2, 3, 1, 1, 4};
        boolean expected = true;
        boolean result = solution.canJump(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testCanJumpExample2() {
        JumpGame solution = new JumpGame();
        int[] nums = {3, 2, 1, 0, 4};
        boolean expected = false;
        boolean result = solution.canJump(nums);
        assertEquals(expected, result);
    }
}