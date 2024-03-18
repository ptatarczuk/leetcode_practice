package org.example.SlidingWindow;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SubstringWithConcatenationOfAllWordsTest {
    public static void main(String[] args) {
        SubstringWithConcatenationOfAllWordsTest tester = new SubstringWithConcatenationOfAllWordsTest();
        tester.testExample1();
        tester.testExample2();
        tester.testExample3();
    }

    public void testExample1() {
        SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> expected = Arrays.asList(0, 9);
        List<Integer> result = solution.findSubstring(s, words);
        assert expected.equals(result) : "Test Example 1 Failed";
        System.out.println("Test Example 1 Passed");
    }

    public void testExample2() {
        SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();
        String s = "wordgoodgoodgoodbestword";
        String[] words = {"word", "good", "best", "word"};
        List<Integer> expected = Arrays.asList();
        List<Integer> result = solution.findSubstring(s, words);
        assert expected.equals(result) : "Test Example 2 Failed";
        System.out.println("Test Example 2 Passed");
    }

    public void testExample3() {
        SubstringWithConcatenationOfAllWords solution = new SubstringWithConcatenationOfAllWords();
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};
        List<Integer> expected = Arrays.asList(6, 9, 12);
        List<Integer> result = solution.findSubstring(s, words);
        assert expected.equals(result) : "Test Example 3 Failed";
        System.out.println("Test Example 3 Passed");
    }

}