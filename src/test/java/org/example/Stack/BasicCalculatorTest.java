package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    @Test
    public void testCalculate_Example1() {
        BasicCalculator calculator = new BasicCalculator();
        String input = "1 + 1";
        int expectedOutput = 2;
        assertEquals(expectedOutput, calculator.calculate(input));
    }

    @Test
    public void testCalculate_Example2() {
        BasicCalculator calculator = new BasicCalculator();
        String input = " 2-1 + 2 ";
        int expectedOutput = 3;
        assertEquals(expectedOutput, calculator.calculate(input));
    }

    @Test
    public void testCalculate_Example3() {
        BasicCalculator calculator = new BasicCalculator();
        String input = "(1+(4+5+2)-3)+(6+8)";
        int expectedOutput = 23;
        assertEquals(expectedOutput, calculator.calculate(input));
    }

}