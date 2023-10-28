package org.example.Intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {
    @Test
    public void testMergeIntervals() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        // Test Case 1
        int[][] intervals1 = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] expected1 = {{1, 6}, {8, 10}, {15, 18}};
        assertArrayEquals(expected1, mergeIntervals.merge(intervals1));

        // Test Case 2
        int[][] intervals2 = {{1, 4}, {4, 5}};
        int[][] expected2 = {{1, 5}};
        assertArrayEquals(expected2, mergeIntervals.merge(intervals2));

        // Test Case 4: Non-overlapping intervals should remain unchanged.
        int[][] intervals4 = {{1, 2}, {4, 6}, {8, 10}};
        int[][] expected4 = {{1, 2}, {4, 6}, {8, 10}};
        assertArrayEquals(expected4, mergeIntervals.merge(intervals4));

        // Test Case 5: Overlapping intervals with negative numbers.
        int[][] intervals5 = {{-1, 3}, {-2, 2}, {2, 4}, {0, 5}};
        int[][] expected5 = {{-2, 5}};
        assertArrayEquals(expected5, mergeIntervals.merge(intervals5));
    }

}