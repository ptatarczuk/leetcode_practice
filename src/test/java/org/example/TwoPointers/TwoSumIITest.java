package org.example.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumIITest {
    @Test
    public void testTwoSum() {
        TwoSumII twoSumII = new TwoSumII();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {1, 2};
        assertArrayEquals(expected, twoSumII.twoSum(numbers, target));

        int[] numbers2 = {2, 3, 4};
        int target2 = 6;
        int[] expected2 = {1, 3};
        assertArrayEquals(expected2, twoSumII.twoSum(numbers2, target2));

        int[] numbers3 = {-1, 0};
        int target3 = -1;
        int[] expected3 = {1, 2};
        assertArrayEquals(expected3, twoSumII.twoSum(numbers3, target3));

        int[] numbers5 = {2, 3, 4, 5};
        int target5 = 1;
        int[] expected5 = {-1, -1};
        assertArrayEquals(expected5, twoSumII.twoSum(numbers5, target5));
    }
}