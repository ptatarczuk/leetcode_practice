package org.example.OneD_DP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestIncreasingSubsequenceTest {
    @Test
    public void testExample1() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        int result = lis.lengthOfLIS(nums);
        assertEquals(4, result);
    }

    @Test
    public void testExample2() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] nums = {0, 1, 0, 3, 2, 3};
        int result = lis.lengthOfLIS(nums);
        assertEquals(4, result);
    }

    @Test
    public void testExample3() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        int result = lis.lengthOfLIS(nums);
        assertEquals(1, result);
    }

    @Test
    public void testEmptyArray() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] nums = {};
        int result = lis.lengthOfLIS(nums);
        assertEquals(0, result);
    }

    @Test
    public void testNullArray() {
        LongestIncreasingSubsequence lis = new LongestIncreasingSubsequence();
        int[] nums = null;
        int result = lis.lengthOfLIS(nums);
        assertEquals(0, result);
    }

}