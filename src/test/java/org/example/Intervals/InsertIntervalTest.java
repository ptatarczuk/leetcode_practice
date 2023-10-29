package org.example.Intervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertIntervalTest {
    @Test
    public void testInsert() {
        InsertInterval inserter = new InsertInterval();

        // Test Case 1: Basic test case with non-overlapping intervals
        int[][] intervals1 = {{1, 3}, {6, 9}};
        int[] newInterval1 = {2, 5};
        int[][] expected1 = {{1, 3}, {2, 5}, {6, 9}};
        assertArrayEquals(expected1, inserter.insert(intervals1, newInterval1));

        // Test Case 2: Basic test case with overlapping intervals
        int[][] intervals2 = {{1, 3}, {6, 9}};
        int[] newInterval2 = {2, 7};
        int[][] expected2 = {{1, 3}, {2, 9}};
        assertArrayEquals(expected2, inserter.insert(intervals2, newInterval2));

        // Test Case 3: Empty input intervals
        int[][] intervals3 = {};
        int[] newInterval3 = {2, 5};
        int[][] expected3 = {{2, 5}};
        assertArrayEquals(expected3, inserter.insert(intervals3, newInterval3));

        // Test Case 4: Empty newInterval
        int[][] intervals4 = {{1, 3}, {6, 9}};
        int[] newInterval4 = {};
        int[][] expected4 = {{1, 3}, {6, 9}};
        assertArrayEquals(expected4, inserter.insert(intervals4, newInterval4));
    }
}