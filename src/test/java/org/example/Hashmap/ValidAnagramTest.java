package org.example.Hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidAnagramTest {
    @Test
    public void testIsAnagram() {
        ValidAnagram validAnagram = new ValidAnagram();

        // Test cases for valid anagrams
        assertTrue(validAnagram.isAnagram("anagram", "nagaram"));
        assertTrue(validAnagram.isAnagram("silent", "listen"));
        assertTrue(validAnagram.isAnagram("cinema", "iceman"));

        // Test cases for non-anagrams
        assertFalse(validAnagram.isAnagram("hello", "world"));
        assertFalse(validAnagram.isAnagram("rat", "car"));
        assertFalse(validAnagram.isAnagram("abc", "abcd"));

        // Test cases for strings of different lengths
        assertFalse(validAnagram.isAnagram("listen", "silentx"));

    }
}