package org.example.BitManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOf1BitsTest {
    @Test
    public void testHammingWeightExample1() {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        int result = numberOf1Bits.hammingWeight(0b00000000000000000000000000001011);
        assertEquals(3, result, "Example 1 failed");
    }

    @Test
    public void testHammingWeightExample2() {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        int result = numberOf1Bits.hammingWeight(0b00000000000000000000000010000000);
        assertEquals(1, result, "Example 2 failed");
    }

    @Test
    public void testHammingWeightExample3() {
        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        int result = numberOf1Bits.hammingWeight(0b11111111111111111111111111111101);
        assertEquals(31, result, "Example 3 failed");
    }

}