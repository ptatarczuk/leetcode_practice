package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesTest {
    @Test
    public void testRemoveDuplicates() {
        RemoveDuplicates remover = new RemoveDuplicates();

        // Test case 1
        int[] nums1 = {1, 1, 2};
        int expectedSize1 = 2;
        int[] expectedArray1 = {1, 2};
        int actualSize1 = remover.removeDuplicates(nums1);
        int[] actualArray1 = Arrays.copyOf(nums1, actualSize1);
        assertEquals(expectedSize1, actualSize1);
        assertArrayEquals(expectedArray1, actualArray1);

        // Test case 2
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedSize2 = 5;
        int[] expectedArray2 = {0, 1, 2, 3, 4};
        int actualSize2 = remover.removeDuplicates(nums2);
        int[] actualArray2 = Arrays.copyOf(nums2, actualSize2);
        assertEquals(expectedSize2, actualSize2);
        assertArrayEquals(expectedArray2, actualArray2);
    }

}