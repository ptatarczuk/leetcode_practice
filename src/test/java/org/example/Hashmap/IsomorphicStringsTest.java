package org.example.Hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsomorphicStringsTest {
    @Test
    public void testIsIsomorphic() {
        IsomorphicStrings isomorphicStrings = new IsomorphicStrings();

        // Test cases for isomorphic strings
        assertTrue(isomorphicStrings.isIsomorphic("egg", "add"));
        assertTrue(isomorphicStrings.isIsomorphic("paper", "title"));

        // Test cases for non-isomorphic strings
        assertFalse(isomorphicStrings.isIsomorphic("foo", "bar"));
        assertFalse(isomorphicStrings.isIsomorphic("abc", "xyy"));

        // Edge case: empty strings should be considered isomorphic
        assertTrue(isomorphicStrings.isIsomorphic("", ""));

        // Edge case: strings with different lengths should not be isomorphic
        assertFalse(isomorphicStrings.isIsomorphic("abc", "ab"));
    }
}