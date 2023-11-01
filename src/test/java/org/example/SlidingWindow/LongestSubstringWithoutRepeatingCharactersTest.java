package org.example.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubstringWithoutRepeatingCharactersTest {
    @Test
    public void testExample1() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        int expected = 3;
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "bbbbb";
        int expected = 1;
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "pwwkew";
        int expected = 3;
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, result);
    }

    @Test
    public void testEmptyString() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "";
        int expected = 0;
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, result);
    }

    @Test
    public void testSingleCharacterString() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "x";
        int expected = 1;
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, result);
    }

    @Test
    public void testStringWithNoRepeatingCharacters() {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();
        String s = "abcdefg";
        int expected = 7;
        int result = solution.lengthOfLongestSubstring(s);
        assertEquals(expected, result);
    }
}