package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedArrayIITest {
    @Test
    public void testRemoveDuplicatesExample1() {
        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int expectedLength = 5;
        int[] expectedArray = {1, 1, 2, 2, 3}; // Expected elements up to k
        int result = solution.removeDuplicates(nums);

        assertEquals(expectedLength, result);
        assertArrayEquals(expectedArray, Arrays.copyOfRange(nums, 0, result));
    }

    @Test
    public void testRemoveDuplicatesExample2() {
        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int expectedLength = 7;
        int[] expectedArray = {0, 0, 1, 1, 2, 3, 3}; // Expected elements up to k
        int result = solution.removeDuplicates(nums);

        assertEquals(expectedLength, result);
        assertArrayEquals(expectedArray, Arrays.copyOfRange(nums, 0, result));
    }

    @Test
    public void testRemoveDuplicatesWithEmptyArray() {
        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = {};
        int expectedLength = 0;
        int[] expectedArray = {}; // Empty array should remain empty
        int result = solution.removeDuplicates(nums);

        assertEquals(expectedLength, result);
        assertArrayEquals(expectedArray, Arrays.copyOfRange(nums, 0, result));
    }

    @Test
    public void testRemoveDuplicatesWithNoDuplicates() {
        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = {1, 2, 3, 4, 5};
        int expectedLength = 5;
        int[] expectedArray = {1, 2, 3, 4, 5}; // No duplicates, array remains the same
        int result = solution.removeDuplicates(nums);

        assertEquals(expectedLength, result);
        assertArrayEquals(expectedArray, Arrays.copyOfRange(nums, 0, result));
    }

    @Test
    public void testRemoveDuplicatesWithSingleElement() {
        RemoveDuplicatesFromSortedArrayII solution = new RemoveDuplicatesFromSortedArrayII();
        int[] nums = {1};
        int expectedLength = 1;
        int[] expectedArray = {1}; // Single element array, no change
        int result = solution.removeDuplicates(nums);

        assertEquals(expectedLength, result);
        assertArrayEquals(expectedArray, Arrays.copyOfRange(nums, 0, result));
    }
}