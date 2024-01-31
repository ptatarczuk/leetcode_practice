package org.example.Math;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PowTest {
    @Test
    public void testExample1() {
        Pow pow = new Pow();
        double result = pow.myPow(2.00000, 10);
        assertEquals(1024.00000, result, 0.00001);
    }

    @Test
    public void testExample2() {
        Pow pow = new Pow();
        double result = pow.myPow(2.10000, 3);
        assertEquals(9.26100, result, 0.00001);
    }

    @Test
    public void testExample3() {
        Pow pow = new Pow();
        double result = pow.myPow(2.00000, -2);
        assertEquals(0.25000, result, 0.00001);
    }

    @Test
    public void testZeroExponent() {
        Pow pow = new Pow();
        double result = pow.myPow(3.00000, 0);
        assertEquals(1.00000, result, 0.00001);
    }

    @Test
    public void testNegativeBase() {
        Pow pow = new Pow();
        double result = pow.myPow(-2.00000, 5);
        assertEquals(-32.00000, result, 0.00001);
    }

    @Test
    public void testNegativeExponent() {
        Pow pow = new Pow();
        double result = pow.myPow(1.50000, -3);
        assertEquals(0.29629, result, 0.00001);
    }
}