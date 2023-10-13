package org.example.TwoPointers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {
    @Test
    public void testIsPalindrome() {
        ValidPalindrome palindromeChecker = new ValidPalindrome();

        // Test case 1: Valid palindrome
        assertTrue(palindromeChecker.isPalindrome("A man, a plan, a canal: Panama"), true);

        // Test case 2: Not a palindrome
        assertTrue(palindromeChecker.isPalindrome("race a car"), false);

        // Test case 3: Empty string is a valid palindrome
        assertTrue(palindromeChecker.isPalindrome(" "), true);
    }

    // Helper method for simplifying test assertions
    private void assertTrue(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }
}