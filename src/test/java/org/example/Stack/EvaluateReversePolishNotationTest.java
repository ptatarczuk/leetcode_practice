package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvaluateReversePolishNotationTest {
    @Test
    public void testEvalRPN() {
        EvaluateReversePolishNotation evaluator = new EvaluateReversePolishNotation();

        String[] tokens1 = {"2", "1", "+", "3", "*"};
        assertEquals(9, evaluator.evalRPN(tokens1));

        String[] tokens2 = {"4", "13", "5", "/", "+"};
        assertEquals(6, evaluator.evalRPN(tokens2));

        String[] tokens3 = {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
        assertEquals(22, evaluator.evalRPN(tokens3));
    }
}