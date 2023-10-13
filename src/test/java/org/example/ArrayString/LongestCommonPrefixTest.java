package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    @Test
    public void testLongestCommonPrefix() {
        LongestCommonPrefix prefixFinder = new LongestCommonPrefix();

        // Test case 1: Common prefix "fl"
        String[] words1 = {"flower", "flour", "flask"};
        assertEquals("fl", prefixFinder.longestCommonPrefix(words1));

        // Test case 2: No common prefix
        String[] words2 = {"dog", "car", "fish"};
        assertEquals("", prefixFinder.longestCommonPrefix(words2));

        // Test case 3: Common prefix "abc"
        String[] words3 = {"abcde", "abcxyz", "abcpqr"};
        assertEquals("abc", prefixFinder.longestCommonPrefix(words3));

        // Test case 4: Empty input
        String[] words4 = {};
        assertEquals("", prefixFinder.longestCommonPrefix(words4));

        // Test case 5: Single word
        String[] words5 = {"unique"};
        assertEquals("unique", prefixFinder.longestCommonPrefix(words5));

        // Test case 6: All empty strings
        String[] words6 = {"", "", "", ""};
        assertEquals("", prefixFinder.longestCommonPrefix(words6));

        // Test case 7: Common prefix "apple"
        String[] words7 = {"apple", "appletree", "applesauce"};
        assertEquals("apple", prefixFinder.longestCommonPrefix(words7));
    }
}