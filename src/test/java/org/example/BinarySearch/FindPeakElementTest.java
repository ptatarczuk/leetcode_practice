package org.example.BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindPeakElementTest {

    @Test
    public void testFindPeakElement1() {
        FindPeakElement finder = new FindPeakElement();
        int[] nums = {1, 2, 3, 1};
        assertEquals(2, finder.findPeakElement(nums));
    }

    @Test
    public void testFindPeakElement2() {
        FindPeakElement finder = new FindPeakElement();
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int result = finder.findPeakElement(nums);
        assertTrue(result == 1 || result == 5);
    }

    @Test
    public void testFindPeakElement3() {
        FindPeakElement finder = new FindPeakElement();
        int[] nums = {1, 2, 3, 4, 5};
        assertEquals(4, finder.findPeakElement(nums));
    }

    @Test
    public void testFindPeakElement4() {
        FindPeakElement finder = new FindPeakElement();
        int[] nums = {5, 4, 3, 2, 1};
        assertEquals(0, finder.findPeakElement(nums));
    }

    @Test
    public void testFindPeakElement5() {
        FindPeakElement finder = new FindPeakElement();
        int[] nums = {1};
        assertEquals(0, finder.findPeakElement(nums));
    }

    @Test
    public void testFindPeakElement6() {
        FindPeakElement finder = new FindPeakElement();
        int[] nums = {1, 3, 20, 4, 1, 0};
        assertEquals(2, finder.findPeakElement(nums));
    }
}