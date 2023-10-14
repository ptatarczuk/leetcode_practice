package org.example.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsSubsequenceTest {
    @Test
    public void testIsSubsequence() {
        IsSubsequence checker = new IsSubsequence();

        // Test case 1: s is a subsequence of t
        assertTrue(checker.isSubsequence("abc", "ahbgdc"), true);

        // Test case 2: s is not a subsequence of t
        assertTrue(checker.isSubsequence("axc", "ahbgdc"), false);

        // Test case 3: s is an empty string, should return true
        assertTrue(checker.isSubsequence("", "ahbgdc"), true);

        // Test case 4: t is an empty string, should return true
        assertTrue(checker.isSubsequence("abc", ""), false);

        // Test case 5: Both s and t are empty strings, should return true
        assertTrue(checker.isSubsequence("", ""), true);
    }

    // Helper method for simplifying test assertions
    private void assertTrue(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }
}