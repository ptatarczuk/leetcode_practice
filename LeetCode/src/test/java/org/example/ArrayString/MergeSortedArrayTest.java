package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {
    @Test
    public void testMerge() {
        MergeSortedArray merger = new MergeSortedArray();

        // Test case 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};
        merger.merge(nums1, m, nums2, n);
        assertArrayEquals(expected, nums1);

        // Test case 2
        int[] nums3 = {1};
        int m2 = 1;
        int[] nums4 = {};
        int n2 = 0;
        int[] expected2 = {1};
        merger.merge(nums3, m2, nums4, n2);
        assertArrayEquals(expected2, nums3);

        // Test case 3
        int[] nums5 = {0};
        int m3 = 0;
        int[] nums6 = {1};
        int n3 = 1;
        int[] expected3 = {1};
        merger.merge(nums5, m3, nums6, n3);
        assertArrayEquals(expected3, nums5);
    }

}