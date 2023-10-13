package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindTheIndexOfTheFirstOccurrenceTest {
    @Test
    public void testStrStr() {
        FindTheIndexOfTheFirstOccurrence strStrFinder = new FindTheIndexOfTheFirstOccurrence();

        // Test case 1: Needle found in haystack
        assertEquals(2, strStrFinder.strStr("hello", "ll"));

        // Test case 2: Needle not found in haystack
        assertEquals(-1, strStrFinder.strStr("aaaaa", "bba"));

        // Test case 3: Empty haystack
        assertEquals(0, strStrFinder.strStr("", "needle"));

        // Test case 4: Empty needle
        assertEquals(0, strStrFinder.strStr("haystack", ""));

        // Test case 5: Needle is the entire haystack
        assertEquals(0, strStrFinder.strStr("abcde", "abcde"));

        // Test case 6: Needle at the beginning of the haystack
        assertEquals(0, strStrFinder.strStr("abcdef", "abc"));

        // Test case 7: Needle at the end of the haystack
        assertEquals(3, strStrFinder.strStr("abcdef", "def"));

        // Test case 8: Needle in the middle of the haystack
        assertEquals(1, strStrFinder.strStr("abcabc", "bca"));

        // Test case 9: Needle is longer than the haystack
        assertEquals(-1, strStrFinder.strStr("abc", "abcdef"));
    }
}