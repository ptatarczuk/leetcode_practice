package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    @Test
    public void testLengthOfLastWord() {
        LengthOfLastWord lengthCalculator = new LengthOfLastWord();

        // Test case 1
        assertEquals(5, lengthCalculator.lengthOfLastWord("Hello World"));

        // Test case 2
        assertEquals(12, lengthCalculator.lengthOfLastWord("NoSpacesHere"));

        // Test case 3
        assertEquals(11, lengthCalculator.lengthOfLastWord("LengthyWord     "));

        // Test case 4
        assertEquals(0, lengthCalculator.lengthOfLastWord(""));

        // Test case 5
        assertEquals(5, lengthCalculator.lengthOfLastWord("  Four  Words  "));
    }

}