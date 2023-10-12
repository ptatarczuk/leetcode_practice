package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MajorityElementTest {

    @Test
    public void testMajorityElement() {
        MajorityElement majorityElement = new MajorityElement();

        // Test case 1
        int[] nums1 = {3, 2, 3};
        int expected1 = 3;
        int actual1 = majorityElement.majorityElement(nums1);
        assertEquals(expected1, actual1);

        // Test case 2
        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        int expected2 = 2;
        int actual2 = majorityElement.majorityElement(nums2);
        assertEquals(expected2, actual2);
    }
}