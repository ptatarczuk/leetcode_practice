package org.example.Backtracking;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GenerateParenthesesTest {
    @Test
    public void testGenerateParenthesisExample1() {
        GenerateParentheses generator = new GenerateParentheses();
        int n = 3;
        List<String> expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");
        List<String> result = generator.generateParenthesis(n);
        assertEquals(expected, result);
    }

    @Test
    public void testGenerateParenthesisExample2() {
        GenerateParentheses generator = new GenerateParentheses();
        int n = 1;
        List<String> expected = Arrays.asList("()");
        List<String> result = generator.generateParenthesis(n);
        assertEquals(expected, result);
    }


}