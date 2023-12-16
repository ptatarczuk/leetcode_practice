package org.example.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LetterCombinationsOfAPhoneNumberTest {
    @Test
    public void testLetterCombinationsWithValidInput() {
        LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();
        List<String> result = solution.letterCombinations("23");

        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected, result);
    }

    @Test
    public void testLetterCombinationsWithEmptyInput() {
        LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();
        List<String> result = solution.letterCombinations("");

        assertEquals(Collections.emptyList(), result);
    }

    @Test
    public void testLetterCombinationsWithSingleDigit() {
        LetterCombinationsOfAPhoneNumber solution = new LetterCombinationsOfAPhoneNumber();
        List<String> result = solution.letterCombinations("2");

        List<String> expected = Arrays.asList("a", "b", "c");
        assertEquals(expected, result);
    }

}