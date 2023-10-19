package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductOfArrayExceptSelfTest {
    @Test
    public void testProductExceptSelfExample1() {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = {1, 2, 3, 4};
        int[] expected = {24, 12, 8, 6};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testProductExceptSelfExample2() {
        ProductOfArrayExceptSelf solution = new ProductOfArrayExceptSelf();
        int[] nums = {-1, 1, 0, -3, 3};
        int[] expected = {0, 0, 9, 0, 0};
        int[] result = solution.productExceptSelf(nums);
        assertArrayEquals(expected, result);
    }
}