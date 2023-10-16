package org.example.Hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();

        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] expected1 = {0, 1};
        int[] result1 = twoSum.twoSum(nums1, target1);
        boolean valid1 = (result1[0] == expected1[0] && result1[1] == expected1[1]) ||
                (result1[0] == expected1[1] && result1[1] == expected1[0]);
        assertTrue(valid1);

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] expected2 = {1, 2};
        int[] result2 = twoSum.twoSum(nums2, target2);
        boolean valid2 = (result2[0] == expected2[0] && result2[1] == expected2[1]) ||
                (result2[0] == expected2[1] && result2[1] == expected2[0]);
        assertTrue(valid2);

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] expected3 = {0, 1};
        int[] result3 = twoSum.twoSum(nums3, target3);
        boolean valid3 = (result3[0] == expected3[0] && result3[1] == expected3[1]) ||
                (result3[0] == expected3[1] && result3[1] == expected3[0]);
        assertTrue(valid3);
    }
}