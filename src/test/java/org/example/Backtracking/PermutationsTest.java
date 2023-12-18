package org.example.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PermutationsTest {
    @Test
    public void testPermuteExample1() {
        Permutations permutations = new Permutations();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = permutations.permute(nums);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3, 2));
        expected.add(Arrays.asList(2, 1, 3));
        expected.add(Arrays.asList(2, 3, 1));
        expected.add(Arrays.asList(3, 1, 2));
        expected.add(Arrays.asList(3, 2, 1));

        // Sort the inner lists for both expected and actual results
        expected.forEach(Collections::sort);
        result.forEach(Collections::sort);

        // Sort the outer lists for both expected and actual results
        expected.sort(Comparator.comparing(Object::toString));
        result.sort(Comparator.comparing(Object::toString));

        assertEquals(expected, result);
    }

}