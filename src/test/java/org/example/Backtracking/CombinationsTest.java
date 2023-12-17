package org.example.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CombinationsTest {
    @Test
    void testCombineExample1() {
        Combinations combinations = new Combinations();
        List<List<Integer>> result = combinations.combine(4, 2);

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(1, 3),
                Arrays.asList(1, 4),
                Arrays.asList(2, 3),
                Arrays.asList(2, 4),
                Arrays.asList(3, 4)
        );

        assertEquals(expected, result);
    }

    @Test
    void testCombineExample2() {
        Combinations combinations = new Combinations();
        List<List<Integer>> result = combinations.combine(1, 1);

        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(1)
        );

        assertEquals(expected, result);
    }

}