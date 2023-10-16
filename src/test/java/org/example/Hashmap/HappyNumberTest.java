package org.example.Hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HappyNumberTest {
    @Test
    public void testIsHappy() {
        HappyNumber happyNumber = new HappyNumber();

        // Test case for a happy number (19)
        int n1 = 19;
        assertTrue(happyNumber.isHappy(n1));

        // Test case for a non-happy number (2)
        int n2 = 2;
        assertFalse(happyNumber.isHappy(n2));
    }
}