package org.example.Heap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthLargestElementInAnArrayTest {
    @Test
    public void testExample1() {
        KthLargestElementInAnArray solution = new KthLargestElementInAnArray();
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int expected = 5;
        assertEquals(expected, solution.findKthLargest(nums, k));
    }

    @Test
    public void testExample2() {
        KthLargestElementInAnArray solution = new KthLargestElementInAnArray();
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int expected = 4;
        assertEquals(expected, solution.findKthLargest(nums, k));
    }
}