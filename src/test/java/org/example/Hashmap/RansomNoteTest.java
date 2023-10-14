package org.example.Hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RansomNoteTest {
    @Test
    public void testCanConstruct() {
        RansomNote ransomNoteChecker = new RansomNote();

        // Test case 1: Ransom note can be constructed
        assertTrue(ransomNoteChecker.canConstruct("a", "bca"), true);

        // Test case 2: Ransom note cannot be constructed
        assertTrue(ransomNoteChecker.canConstruct("aa", "abca"), false);

        // Test case 3: Empty ransom note, should return true
        assertTrue(ransomNoteChecker.canConstruct("", "abca"), true);

        // Test case 4: Empty magazine, should return false
        assertTrue(ransomNoteChecker.canConstruct("abc", ""), false);

        // Test case 5: Both empty, should return true
        assertTrue(ransomNoteChecker.canConstruct("", ""), true);

        // Test case 6: Magazine has extra characters
        assertTrue(ransomNoteChecker.canConstruct("abc", "abcabc"), true);

        // Test case 7: Magazine has just enough characters
        assertTrue(ransomNoteChecker.canConstruct("abc", "bacbac"), true);

        // Test case 8: Magazine doesn't have enough 'b'
        assertTrue(ransomNoteChecker.canConstruct("abb", "bacbac"), false);
    }

    // Helper method for simplifying test assertions
    private void assertTrue(boolean actual, boolean expected) {
        assertEquals(expected, actual);
    }
}