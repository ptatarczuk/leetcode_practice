package org.example.Heap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindKPairsWithSmallestSumsTest {
    @Test
    public void testExample1() {
        FindKPairsWithSmallestSums solution = new FindKPairsWithSmallestSums();
        int[] nums1 = {1, 7, 11};
        int[] nums2 = {2, 4, 6};
        int k = 3;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1, 2));
        expected.add(List.of(1, 4));
        expected.add(List.of(1, 6));
        assertEquals(expected, solution.kSmallestPairs(nums1, nums2, k));
    }

    @Test
    public void testExample2() {
        FindKPairsWithSmallestSums solution = new FindKPairsWithSmallestSums();
        int[] nums1 = {1, 1, 2};
        int[] nums2 = {1, 2, 3};
        int k = 2;
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(List.of(1, 1));
        expected.add(List.of(1, 1));
        assertEquals(expected, solution.kSmallestPairs(nums1, nums2, k));
    }

    @Test
    public void testEmptyArrays() {
        FindKPairsWithSmallestSums solution = new FindKPairsWithSmallestSums();
        int[] nums1 = {};
        int[] nums2 = {};
        int k = 0;
        List<List<Integer>> expected = new ArrayList<>();
        assertEquals(expected, solution.kSmallestPairs(nums1, nums2, k));
    }

}