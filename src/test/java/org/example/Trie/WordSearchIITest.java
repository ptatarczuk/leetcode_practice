package org.example.Trie;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchIITest {
    public static void main(String[] args) {
        WordSearchIITest test = new WordSearchIITest();
        test.testExample1();
        test.testExample2();
        // Add more test cases as needed
    }

    public void testExample1() {
        char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}
        };
        String[] words = {"oath", "pea", "eat", "rain"};
        List<String> expected = Arrays.asList("eat", "oath");

        WordSearchII wordSearch = new WordSearchII();
        List<String> result = wordSearch.findWords(board, words);

        System.out.println("Test Example 1:");
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assert expected.equals(result);
        System.out.println("Test Passed!\n");
    }

    public void testExample2() {
        char[][] board = {
                {'a','b'},
                {'c','d'}
        };
        String[] words = {"abcb"};
        List<String> expected = Arrays.asList();

        WordSearchII wordSearch = new WordSearchII();
        List<String> result = wordSearch.findWords(board, words);

        System.out.println("Test Example 2:");
        System.out.println("Expected: " + expected);
        System.out.println("Result: " + result);
        assert expected.equals(result);
        System.out.println("Test Passed!\n");
    }
}