package org.example.Backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchIsRotatedSortedArrayTest {
    @Test
    public void testSearch_rotatedArray_targetInArray() {
        SearchIsRotatedSortedArray searchIsRotatedSortedArray = new SearchIsRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int expectedResult = 4;
        int result = searchIsRotatedSortedArray.search(nums, target);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch_rotatedArray_targetNotInArray() {
        SearchIsRotatedSortedArray searchIsRotatedSortedArray = new SearchIsRotatedSortedArray();
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 3;
        int expectedResult = -1;
        int result = searchIsRotatedSortedArray.search(nums, target);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch_singleElementArray_targetNotInArray() {
        SearchIsRotatedSortedArray searchIsRotatedSortedArray = new SearchIsRotatedSortedArray();
        int[] nums = {1};
        int target = 0;
        int expectedResult = -1;
        int result = searchIsRotatedSortedArray.search(nums, target);
        assertEquals(expectedResult, result);
    }

    @Test
    public void testSearch_singleElementArray_targetInArray() {
        SearchIsRotatedSortedArray searchIsRotatedSortedArray = new SearchIsRotatedSortedArray();
        int[] nums = {1};
        int target = 1;
        int expectedResult = 0;
        int result = searchIsRotatedSortedArray.search(nums, target);
        assertEquals(expectedResult, result);
    }

}