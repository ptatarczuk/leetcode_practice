package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZigZagConversionTest {
    @Test
    public void testConvertExample1() {
        ZigZagConversion solution = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        int numRows = 3;
        String expected = "PAHNAPLSIIGYIR";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertExample2() {
        ZigZagConversion solution = new ZigZagConversion();
        String s = "PAYPALISHIRING";
        int numRows = 4;
        String expected = "PINALSIGYAHRPI";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

    @Test
    public void testConvertExample3() {
        ZigZagConversion solution = new ZigZagConversion();
        String s = "A";
        int numRows = 1;
        String expected = "A";
        String result = solution.convert(s, numRows);
        assertEquals(expected, result);
    }

}