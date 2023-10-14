package org.example.Hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {
    @Test
    public void testWordPattern() {
        WordPattern wordPattern = new WordPattern();

        // Test cases for word patterns
        assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));
        assertTrue(wordPattern.wordPattern("aaaa", "dog dog dog dog"));
        assertTrue(wordPattern.wordPattern("abcde", "apple banana cherry date egg"));

        // Test cases for non-matching word patterns
        assertFalse(wordPattern.wordPattern("abba", "dog cat cat fish"));
        assertFalse(wordPattern.wordPattern("aaaa", "dog dog dog cat"));
        assertFalse(wordPattern.wordPattern("abcde", "apple banana cherry date"));

        // Test cases for patterns with different lengths
        assertFalse(wordPattern.wordPattern("abc", "dog cat"));

    }
}