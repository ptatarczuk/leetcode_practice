package org.example.BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMinimumIsRotatedSortedArrayTest {
    @Test
    public void testFindMinExample1() {
        FindMinimumIsRotatedSortedArray solution = new FindMinimumIsRotatedSortedArray();
        int[] nums = {3, 4, 5, 1, 2};
        int result = solution.findMin(nums);
        assertEquals(1, result);
    }

    @Test
    public void testFindMinExample2() {
        FindMinimumIsRotatedSortedArray solution = new FindMinimumIsRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int result = solution.findMin(nums);
        assertEquals(0, result);
    }

    @Test
    public void testFindMinExample3() {
        FindMinimumIsRotatedSortedArray solution = new FindMinimumIsRotatedSortedArray();
        int[] nums = {11, 13, 15, 17};
        int result = solution.findMin(nums);
        assertEquals(11, result);
    }

    @Test
    public void testFindMinSingleElementArray() {
        FindMinimumIsRotatedSortedArray solution = new FindMinimumIsRotatedSortedArray();
        int[] nums = {7};
        int result = solution.findMin(nums);
        assertEquals(7, result);
    }

    @Test
    public void testFindMinSortedArrayNoRotation() {
        FindMinimumIsRotatedSortedArray solution = new FindMinimumIsRotatedSortedArray();
        int[] nums = {1, 2, 3, 4, 5};
        int result = solution.findMin(nums);
        assertEquals(1, result);
    }

    @Test
    public void testFindMinArrayWithDuplicates() {
        FindMinimumIsRotatedSortedArray solution = new FindMinimumIsRotatedSortedArray();
        int[] nums = {3, 3, 1, 3};
        int result = solution.findMin(nums);
        assertEquals(1, result);
    }

}