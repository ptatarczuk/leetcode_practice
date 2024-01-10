package org.example.BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoSortedArraysTest {
    @Test
    public void testFindMedianSortedArrays_Example1() {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, result, 0.00001);
    }

    @Test
    public void testFindMedianSortedArrays_Example2() {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, result, 0.00001);
    }

    @Test
    public void testFindMedianSortedArrays_OneEmptyArray() {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, result, 0.00001);
    }

    @Test
    public void testFindMedianSortedArrays_EqualLengthArrays() {
        MedianOfTwoSortedArrays solution = new MedianOfTwoSortedArrays();
        int[] nums1 = {1, 3, 5};
        int[] nums2 = {2, 4, 6};
        double result = solution.findMedianSortedArrays(nums1, nums2);
        assertEquals(3.5, result, 0.00001);
    }
}