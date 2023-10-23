package org.example.TwoPointers;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ThreeSumTest {

    @Test
    public void testThreeSum() {
        ThreeSum threeSumSolver = new ThreeSum();

        // Test case 1: A scenario with a valid three sum
        int[] nums1 = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected1 = List.of(
                List.of(-1, -1, 2),
                List.of(-1, 0, 1)
        );
        assertEquals(expected1, threeSumSolver.threeSum(nums1));

        // Test case 2: No valid three sum
        int[] nums2 = {1, 2, 3, 4, 5};
        List<List<Integer>> expected2 = List.of();
        assertEquals(expected2, threeSumSolver.threeSum(nums2));

        // Test case 3: Empty array
        int[] nums3 = {};
        List<List<Integer>> expected3 = List.of();
        assertEquals(expected3, threeSumSolver.threeSum(nums3));

        // Test case 4: Array with only two elements
        int[] nums4 = {1, 2};
        List<List<Integer>> expected4 = List.of();
        assertEquals(expected4, threeSumSolver.threeSum(nums4));

        // Test case 5: Array with repeated elements
        int[] nums5 = {0, 0, 0};
        List<List<Integer>> expected5 = List.of(List.of(0, 0, 0));
        assertEquals(expected5, threeSumSolver.threeSum(nums5));
    }

}