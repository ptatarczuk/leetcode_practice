package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class RemoveElementTest {
    @Test
    public void testRemoveElement() {
        RemoveElement remover = new RemoveElement();

        // Test case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int expectedSize1 = 2;
        int[] expectedArray1 = {2, 2};
        int actualSize1 = remover.removeElement(nums1, val1);
        int[] actualArray1 = Arrays.copyOf(nums1, actualSize1);
        assertEquals(expectedSize1, actualSize1);
        assertArrayEquals(expectedArray1, actualArray1);

        // Test case 2
        int[] nums2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int val2 = 2;
        int expectedSize2 = 5;
        int[] expectedArray2 = {0, 1, 3, 0, 4}; // Corrected expected array
        int actualSize2 = remover.removeElement(nums2, val2);
        int[] actualArray2 = Arrays.copyOf(nums2, actualSize2);
        assertEquals(expectedSize2, actualSize2);
        assertArrayEquals(expectedArray2, actualArray2);
    }
}