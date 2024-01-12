package org.example.BitManipulation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddBinaryTest {
    @Test
    public void testAddBinaryExample1() {
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("11", "1");
        assertEquals("100", result);
    }

    @Test
    public void testAddBinaryExample2() {
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("1010", "1011");
        assertEquals("10101", result);
    }

    @Test
    public void testAddBinaryWithZeroInput() {
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("0", "0");
        assertEquals("0", result);
    }

    @Test
    public void testAddBinaryWithDifferentLengths() {
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("110", "10");
        assertEquals("1000", result);
    }

    @Test
    public void testAddBinaryWithCarryInMSB() {
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("111", "1");
        assertEquals("1000", result);
    }

    @Test
    public void testAddBinaryWithCarryInLSB() {
        AddBinary addBinary = new AddBinary();
        String result = addBinary.addBinary("1101", "10");
        assertEquals("1111", result);
    }
}