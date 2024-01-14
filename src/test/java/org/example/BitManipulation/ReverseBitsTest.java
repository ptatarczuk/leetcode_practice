package org.example.BitManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseBitsTest {
    @Test
    public void testReverseBitsExample1() {
        ReverseBits reverseBits = new ReverseBits();
        int input = 0b00000010100101000001111010011100;
        int expectedOutput = 0b00111001011110000010100101000000;
        assertEquals(expectedOutput, reverseBits.reverseBits(input));
    }

    @Test
    public void testReverseBitsExample2() {
        ReverseBits reverseBits = new ReverseBits();
        int input = 0b11111111111111111111111111111101;
        int expectedOutput = 0b10111111111111111111111111111111;
        assertEquals(expectedOutput, reverseBits.reverseBits(input));
    }

    @Test
    public void testReverseBitsWithZeroInput() {
        ReverseBits reverseBits = new ReverseBits();
        int input = 0;
        assertEquals(0, reverseBits.reverseBits(input));
    }

    @Test
    public void testReverseBitsWithAllOnesInput() {
        ReverseBits reverseBits = new ReverseBits();
        int input = 0xFFFFFFFF;
        assertEquals(0xFFFFFFFF, reverseBits.reverseBits(input));
    }

    @Test
    public void testReverseBitsWithAlternateBitsInput() {
        ReverseBits reverseBits = new ReverseBits();
        int input = 0b10101010101010101010101010101010;
        int expectedOutput = 0b01010101010101010101010101010101;
        assertEquals(expectedOutput, reverseBits.reverseBits(input));
    }
}