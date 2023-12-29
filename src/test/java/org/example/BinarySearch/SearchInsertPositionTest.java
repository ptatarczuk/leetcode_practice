package org.example.BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInsertPositionTest {
    @Test
    public void testSearchInsertExample1() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(2, result);
    }

    @Test
    public void testSearchInsertExample2() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(1, result);
    }

    @Test
    public void testSearchInsertExample3() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(4, result);
    }

    // Additional test cases

    @Test
    public void testSearchInsertEmptyArray() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {};
        int target = 5;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(0, result);
    }

    @Test
    public void testSearchInsertTargetGreaterThanAllElements() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 8;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(4, result);
    }

    @Test
    public void testSearchInsertTargetSmallerThanAllElements() {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        int[] nums = {1, 3, 5, 6};
        int target = 0;
        int result = searchInsertPosition.searchInsert(nums, target);
        assertEquals(0, result);
    }

}