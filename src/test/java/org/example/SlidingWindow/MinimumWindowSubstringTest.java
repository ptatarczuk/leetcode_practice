package org.example.SlidingWindow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {
    @Test
    public void testExample1() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "ADOBECODEBANC";
        String t = "ABC";
        String expected = "BANC";
        assertEquals(expected, solution.minWindow(s, t));
    }

    @Test
    public void testExample2() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "a";
        String t = "a";
        String expected = "a";
        assertEquals(expected, solution.minWindow(s, t));
    }

    @Test
    public void testExample3() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "a";
        String t = "aa";
        String expected = "";
        assertEquals(expected, solution.minWindow(s, t));
    }

    @Test
    public void testEmptyStrings() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "";
        String t = "";
        String expected = "";
        assertEquals(expected, solution.minWindow(s, t));
    }

    @Test
    public void testUnequalLengths() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "abc";
        String t = "defg";
        String expected = "";
        assertEquals(expected, solution.minWindow(s, t));
    }

    @Test
    public void testNoCommonCharacters() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "abcdefg";
        String t = "xyz";
        String expected = "";
        assertEquals(expected, solution.minWindow(s, t));
    }

    @Test
    public void testAllCharactersInTPresentInS() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "abcxyz";
        String t = "xyz";
        String expected = "xyz";
        assertEquals(expected, solution.minWindow(s, t));
    }

    @Test
    public void testTLongerThanS() {
        MinimumWindowSubstring solution = new MinimumWindowSubstring();
        String s = "abc";
        String t = "abcdefg";
        String expected = "";
        assertEquals(expected, solution.minWindow(s, t));
    }

}