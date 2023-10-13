package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {
    @Test
    public void testRomanToInt() {
        RomanToInteger romanConverter = new RomanToInteger();

        // Test case 1
        assertEquals(3, romanConverter.romanToInt("III"));

        // Test case 2
        assertEquals(58, romanConverter.romanToInt("LVIII"));

        // Test case 3
        assertEquals(1994, romanConverter.romanToInt("MCMXCIV"));
    }
}