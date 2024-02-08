package org.example.OneD_DP;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreakTest {
    @Test
    void testWordBreakExample1() {
        WordBreak wordBreak = new WordBreak();
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        assertTrue(wordBreak.wordBreak(s, wordDict));
    }

    @Test
    void testWordBreakExample2() {
        WordBreak wordBreak = new WordBreak();
        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen");
        assertTrue(wordBreak.wordBreak(s, wordDict));
    }

    @Test
    void testWordBreakExample3() {
        WordBreak wordBreak = new WordBreak();
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertFalse(wordBreak.wordBreak(s, wordDict));
    }

    // Additional test cases

    @Test
    void testWordBreakEmptyString() {
        WordBreak wordBreak = new WordBreak();
        String s = "";
        List<String> wordDict = Arrays.asList("word");
        assertTrue(wordBreak.wordBreak(s, wordDict));
    }

    @Test
    void testWordBreakEmptyDictionary() {
        WordBreak wordBreak = new WordBreak();
        String s = "word";
        List<String> wordDict = Arrays.asList();
        assertFalse(wordBreak.wordBreak(s, wordDict));
    }

    @Test
    void testWordBreakMultiplePossibilities() {
        WordBreak wordBreak = new WordBreak();
        String s = "applepenapple";
        List<String> wordDict = Arrays.asList("apple", "pen", "applepen");
        assertTrue(wordBreak.wordBreak(s, wordDict));
    }
}