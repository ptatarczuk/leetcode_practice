package org.example.KadaneAlgorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSumCircularSubarrayTest {
    @Test
    public void testMaxSubarraySumCircularExample1() {
        MaximumSumCircularSubarray maxCircularSubarray = new MaximumSumCircularSubarray();
        int[] nums = {1, -2, 3, -2};
        int result = maxCircularSubarray.maxSubarraySumCircular(nums);
        assertEquals(3, result);
    }

    @Test
    public void testMaxSubarraySumCircularExample2() {
        MaximumSumCircularSubarray maxCircularSubarray = new MaximumSumCircularSubarray();
        int[] nums = {5, -3, 5};
        int result = maxCircularSubarray.maxSubarraySumCircular(nums);
        assertEquals(10, result);
    }

    @Test
    public void testMaxSubarraySumCircularExample3() {
        MaximumSumCircularSubarray maxCircularSubarray = new MaximumSumCircularSubarray();
        int[] nums = {-3, -2, -3};
        int result = maxCircularSubarray.maxSubarraySumCircular(nums);
        assertEquals(-2, result);
    }
}