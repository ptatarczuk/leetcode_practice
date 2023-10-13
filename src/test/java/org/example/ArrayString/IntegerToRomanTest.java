package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerToRomanTest {
    @Test
    public void testIntToRoman() {
        IntegerToRoman romanConverter = new IntegerToRoman();

        // Test case 1
        assertEquals("III", romanConverter.intToRoman(3));

        // Test case 2
        assertEquals("LVIII", romanConverter.intToRoman(58));

        // Test case 3
        assertEquals("MCMXCIV", romanConverter.intToRoman(1994));
    }
}