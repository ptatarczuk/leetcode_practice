package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseWordsInAStringTest {
    @Test
    public void testReverseWordsExample1() {
        ReverseWordsInAString solution = new ReverseWordsInAString();
        String s = "the sky is blue";
        String expected = "blue is sky the";
        String result = solution.reverseWords(s);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseWordsExample2() {
        ReverseWordsInAString solution = new ReverseWordsInAString();
        String s = "  hello world  ";
        String expected = "world hello";
        String result = solution.reverseWords(s);
        assertEquals(expected, result);
    }

    @Test
    public void testReverseWordsExample3() {
        ReverseWordsInAString solution = new ReverseWordsInAString();
        String s = "a good   example";
        String expected = "example good a";
        String result = solution.reverseWords(s);
        assertEquals(expected, result);
    }

}