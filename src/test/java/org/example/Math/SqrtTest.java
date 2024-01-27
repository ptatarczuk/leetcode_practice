package org.example.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrtTest {
    @Test
    public void testSqrtWithPerfectSquare() {
        Sqrt sqrt = new Sqrt();
        int result = sqrt.mySqrt(4);
        assertEquals(2, result, "Square root of 4 should be 2");
    }

    @Test
    public void testSqrtWithNonPerfectSquare() {
        Sqrt sqrt = new Sqrt();
        int result = sqrt.mySqrt(8);
        assertEquals(2, result, "Square root of 8 should be rounded down to 2");
    }

    @Test
    public void testSqrtWithZero() {
        Sqrt sqrt = new Sqrt();
        int result = sqrt.mySqrt(0);
        assertEquals(0, result, "Square root of 0 should be 0");
    }

    @Test
    public void testSqrtWithOne() {
        Sqrt sqrt = new Sqrt();
        int result = sqrt.mySqrt(1);
        assertEquals(1, result, "Square root of 1 should be 1");
    }

    @Test
    public void testSqrtWithLargeNumber() {
        Sqrt sqrt = new Sqrt();
        int result = sqrt.mySqrt(2147395599);
        assertEquals(46339, result, "Square root of 2147395599 should be 46339");
    }

}