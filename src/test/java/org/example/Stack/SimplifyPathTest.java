package org.example.Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplifyPathTest {
    @Test
    public void testSimplifyPath1() {
        SimplifyPath simplifyPath = new SimplifyPath();
        String input = "/home/";
        String expected = "/home";
        String result = simplifyPath.simplifyPath(input);
        assertEquals(expected, result);
    }

    @Test
    public void testSimplifyPath2() {
        SimplifyPath simplifyPath = new SimplifyPath();
        String input = "/../";
        String expected = "/";
        String result = simplifyPath.simplifyPath(input);
        assertEquals(expected, result);
    }

    @Test
    public void testSimplifyPath3() {
        SimplifyPath simplifyPath = new SimplifyPath();
        String input = "/home//foo/";
        String expected = "/home/foo";
        String result = simplifyPath.simplifyPath(input);
        assertEquals(expected, result);
    }

}