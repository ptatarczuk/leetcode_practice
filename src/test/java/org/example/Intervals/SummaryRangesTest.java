package org.example.Intervals;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {
    @Test
    public void testSummaryRangesExample1() {
        SummaryRanges summaryRanges = new SummaryRanges();
        int[] nums = {0, 1, 2, 4, 5, 7};
        List<String> expected = Arrays.asList("0->2", "4->5", "7");
        List<String> result = summaryRanges.summaryRanges(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSummaryRangesExample2() {
        SummaryRanges summaryRanges = new SummaryRanges();
        int[] nums = {0, 2, 3, 4, 6, 8, 9};
        List<String> expected = Arrays.asList("0", "2->4", "6", "8->9");
        List<String> result = summaryRanges.summaryRanges(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSummaryRangesEmptyInput() {
        SummaryRanges summaryRanges = new SummaryRanges();
        int[] nums = {};
        List<String> expected = Collections.emptyList();
        List<String> result = summaryRanges.summaryRanges(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSummaryRangesSingleElementInput() {
        SummaryRanges summaryRanges = new SummaryRanges();
        int[] nums = {5};
        List<String> expected = Collections.singletonList("5");
        List<String> result = summaryRanges.summaryRanges(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testSummaryRangesConsecutiveInput() {
        SummaryRanges summaryRanges = new SummaryRanges();
        int[] nums = {1, 2, 3, 4, 5};
        List<String> expected = Collections.singletonList("1->5");
        List<String> result = summaryRanges.summaryRanges(nums);
        assertEquals(expected, result);
    }
}