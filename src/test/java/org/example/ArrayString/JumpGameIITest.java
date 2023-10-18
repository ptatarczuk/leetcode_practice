package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JumpGameIITest {
    @Test
    public void testJumpExample1() {
        JumpGameII solution = new JumpGameII();
        int[] nums = {2, 3, 1, 1, 4};
        int expected = 2;
        int result = solution.jump(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testJumpExample2() {
        JumpGameII solution = new JumpGameII();
        int[] nums = {2, 3, 0, 1, 4};
        int expected = 2;
        int result = solution.jump(nums);
        assertEquals(expected, result);
    }
}