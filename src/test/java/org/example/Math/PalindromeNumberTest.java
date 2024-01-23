package org.example.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeNumberTest {
    @Test
    public void testIsPalindromePositive() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(121));
    }

    @Test
    public void testIsPalindromeNegative() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertFalse(palindromeNumber.isPalindrome(-121));
    }

    @Test
    public void testIsPalindromeWithZero() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertFalse(palindromeNumber.isPalindrome(10));
    }

    @Test
    public void testIsPalindromeWithSingleDigit() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(0));
    }

    @Test
    public void testIsPalindromeLargeNumber() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(1234321));
    }

    @Test
    public void testIsPalindromeRandomNumber() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertFalse(palindromeNumber.isPalindrome(45678));
    }

    @Test
    public void testIsPalindromeNegativeSingleDigit() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        assertTrue(palindromeNumber.isPalindrome(7));
    }

}