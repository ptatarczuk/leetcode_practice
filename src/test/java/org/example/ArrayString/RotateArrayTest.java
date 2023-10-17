package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateArrayTest {
    @Test
    public void testRotate() {
        RotateArray rotateArray = new RotateArray();

        // Test Case 1: Rotate by 3
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotateArray.rotate(nums1, k1);
        int[] expected1 = {5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(expected1, nums1);

        // Test Case 2: Rotate by 2
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotateArray.rotate(nums2, k2);
        int[] expected2 = {3, 99, -1, -100};
        assertArrayEquals(expected2, nums2);

        // Test Case 3: No rotation (k = 0)
        int[] nums3 = {1, 2, 3};
        int k3 = 0;
        rotateArray.rotate(nums3, k3);
        int[] expected3 = {1, 2, 3};
        assertArrayEquals(expected3, nums3);

        // Test Case 4: Large rotation (k > nums.length)
        int[] nums4 = {1, 2, 3, 4};
        int k4 = 5;
        rotateArray.rotate(nums4, k4);
        int[] expected4 = {4, 1, 2, 3};
        assertArrayEquals(expected4, nums4);
    }

}