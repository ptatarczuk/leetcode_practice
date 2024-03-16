package org.example.ArrayString;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TextJustificationTest {
    @Test
    public void testExample1() {
        TextJustification textJustification = new TextJustification();
        String[] words = {"This", "is", "an", "example", "of", "text", "justification."};
        int maxWidth = 16;
        List<String> expected = Arrays.asList(
                "This    is    an",
                "example  of text",
                "justification.  "
        );
        List<String> result = textJustification.fullJustify(words, maxWidth);
        assertEquals(expected, result);
    }

    @Test
    public void testExample2() {
        TextJustification textJustification = new TextJustification();
        String[] words = {"What","must","be","acknowledgment","shall","be"};
        int maxWidth = 16;
        List<String> expected = Arrays.asList(
                "What   must   be",
                "acknowledgment  ",
                "shall be        "
        );
        List<String> result = textJustification.fullJustify(words, maxWidth);
        assertEquals(expected, result);
    }

    @Test
    public void testExample3() {
        TextJustification textJustification = new TextJustification();
        String[] words = {"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        int maxWidth = 20;
        List<String> expected = Arrays.asList(
                "Science  is  what we",
                "understand      well",
                "enough to explain to",
                "a  computer.  Art is",
                "everything  else  we",
                "do                  "
        );
        List<String> result = textJustification.fullJustify(words, maxWidth);
        assertEquals(expected, result);
    }

}