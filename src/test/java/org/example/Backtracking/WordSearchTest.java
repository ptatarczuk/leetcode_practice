package org.example.Backtracking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {
    @Test
    public void testExist_WordExists_ReturnsTrue() {
        WordSearch wordSearch = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCCED";
        assertTrue(wordSearch.exist(board, word));
    }

    @Test
    public void testExist_WordExists_MultipleInstances_ReturnsTrue() {
        WordSearch wordSearch = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "SEE";
        assertTrue(wordSearch.exist(board, word));
    }

    @Test
    public void testExist_WordDoesNotExist_ReturnsFalse() {
        WordSearch wordSearch = new WordSearch();
        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
        String word = "ABCB";
        assertFalse(wordSearch.exist(board, word));
    }

    @Test
    public void testExist_SingleLetterWord_ReturnsTrue() {
        WordSearch wordSearch = new WordSearch();
        char[][] board = {{'A'}};
        String word = "A";
        assertTrue(wordSearch.exist(board, word));
    }
}