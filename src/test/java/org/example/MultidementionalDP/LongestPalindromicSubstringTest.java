package org.example.MultidementionalDP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromicSubstringTest {
    @Test
    public void testLongestPalindromeExample1() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String input = "babad";
        String expected = "bab";

        assertEquals(expected, lps.longestPalindrome(input));
    }

    @Test
    public void testLongestPalindromeExample2() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String input = "cbbd";
        String expected = "bb";

        assertEquals(expected, lps.longestPalindrome(input));
    }

    @Test
    public void testLongestPalindromeSingleChar() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String input = "a";
        String expected = "a";

        assertEquals(expected, lps.longestPalindrome(input));
    }

    @Test
    public void testLongestPalindromeEmptyString() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String input = "";
        String expected = "";

        assertEquals(expected, lps.longestPalindrome(input));
    }

    @Test
    public void testLongestPalindromeEvenLength() {
        LongestPalindromicSubstring lps = new LongestPalindromicSubstring();
        String input = "racecar";
        String expected = "racecar";

        assertEquals(expected, lps.longestPalindrome(input));
    }
}