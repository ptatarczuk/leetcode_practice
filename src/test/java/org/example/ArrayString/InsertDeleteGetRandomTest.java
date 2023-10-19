package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InsertDeleteGetRandomTest {
    @Test
    public void testInsertAndRemove() {
        InsertDeleteGetRandom randomSet = new InsertDeleteGetRandom();

        assertTrue(randomSet.insert(1));
        assertTrue(randomSet.insert(2));
        assertTrue(randomSet.insert(3));
        assertFalse(randomSet.insert(1)); // Duplicate insertion should return false

        assertTrue(randomSet.remove(2));
        assertFalse(randomSet.remove(4)); // Removing an element not in the set should return false
    }

    @Test
    public void testGetRandom() {
        InsertDeleteGetRandom randomSet = new InsertDeleteGetRandom();

        assertTrue(randomSet.insert(1));
        assertTrue(randomSet.insert(2));
        assertTrue(randomSet.insert(3));

        int[] results = new int[3];
        for (int i = 0; i < 1000; i++) {
            int randomValue = randomSet.getRandom();
            results[randomValue - 1]++;
        }

        // Check if random values are roughly distributed
        for (int count : results) {
            assertTrue(count > 200); // You may need to adjust this threshold based on testing
        }
    }
}