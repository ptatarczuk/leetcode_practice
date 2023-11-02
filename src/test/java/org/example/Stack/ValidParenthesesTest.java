package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParenthesesTest {
    @Test
    public void testValidParenthesesExample1() {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid("()");
        assertTrue(result);
    }

    @Test
    public void testValidParenthesesExample2() {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid("()[]{}");
        assertTrue(result);
    }

    @Test
    public void testValidParenthesesExample3() {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid("(]");
        assertFalse(result);
    }

    @Test
    public void testValidParenthesesCustomCase1() {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid("([{}])");
        assertTrue(result);
    }

    @Test
    public void testValidParenthesesCustomCase2() {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid("{{[()]}}");
        assertTrue(result);
    }

    @Test
    public void testValidParenthesesCustomCase3() {
        ValidParentheses validParentheses = new ValidParentheses();
        boolean result = validParentheses.isValid("{[()]}}");
        assertFalse(result);
    }

}