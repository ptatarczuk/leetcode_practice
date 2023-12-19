package org.example.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationSumTest {

    @Test
    public void testExample1() {
        CombinationSum combinationSum = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result = combinationSum.combinationSum(candidates, target);

        assertEquals(List.of(List.of(2, 2, 3), List.of(7)), result);
    }

    @Test
    public void testExample2() {
        CombinationSum combinationSum = new CombinationSum();
        int[] candidates = {2, 3, 5};
        int target = 8;
        List<List<Integer>> result = combinationSum.combinationSum(candidates, target);

        assertEquals(List.of(List.of(2, 2, 2, 2), List.of(2, 3, 3), List.of(3, 5)), result);
    }

    @Test
    public void testExample3() {
        CombinationSum combinationSum = new CombinationSum();
        int[] candidates = {2};
        int target = 1;
        List<List<Integer>> result = combinationSum.combinationSum(candidates, target);

        assertEquals(List.of(), result);
    }
}