package org.example.Hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContainsDuplicateIITest {
    @Test
    public void testContainsNearbyDuplicateWithDuplicatesWithinK() {
        ContainsDuplicateII solution = new ContainsDuplicateII();
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void testContainsNearbyDuplicateWithNoDuplicatesWithinK() {
        ContainsDuplicateII solution = new ContainsDuplicateII();
        int[] nums = {1, 2, 3, 4, 5};
        int k = 3;
        assertFalse(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void testContainsNearbyDuplicateWithZeroK() {
        ContainsDuplicateII solution = new ContainsDuplicateII();
        int[] nums = {1, 2, 3, 1};
        int k = 0;
        assertFalse(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void testContainsNearbyDuplicateWithEmptyArray() {
        ContainsDuplicateII solution = new ContainsDuplicateII();
        int[] nums = {};
        int k = 3;
        assertFalse(solution.containsNearbyDuplicate(nums, k));
    }

    @Test
    public void testContainsNearbyDuplicateWithLargeK() {
        ContainsDuplicateII solution = new ContainsDuplicateII();
        int[] nums = {1, 2, 3, 4, 1};
        int k = 100;
        assertTrue(solution.containsNearbyDuplicate(nums, k));
    }
}