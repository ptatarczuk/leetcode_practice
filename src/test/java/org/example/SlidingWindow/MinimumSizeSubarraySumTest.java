package org.example.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumSizeSubarraySumTest {
    @Test
    public void testMinSubArrayLen() {
        MinimumSizeSubarraySum solution = new MinimumSizeSubarraySum();

        // Test Case 1
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target1 = 7;
        int expected1 = 2;
        assertEquals(expected1, solution.minSubArrayLen(target1, nums1));

        // Test Case 2
        int[] nums2 = {1, 4, 4};
        int target2 = 4;
        int expected2 = 1;
        assertEquals(expected2, solution.minSubArrayLen(target2, nums2));

        // Test Case 3
        int[] nums3 = {1, 1, 1, 1, 1, 1, 1, 1};
        int target3 = 11;
        int expected3 = 0;
        assertEquals(expected3, solution.minSubArrayLen(target3, nums3));
    }

}