package org.example.Trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordDictionaryTest {
    @Test
    public void testWordDictionary() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test adding words
        wordDictionary.addWord("bad");
        wordDictionary.addWord("dad");
        wordDictionary.addWord("mad");

        // Test searching words
        assertFalse(wordDictionary.search("pad")); // should return False
        assertTrue(wordDictionary.search("bad")); // should return True

        // Test searching words with wildcard '.'
        assertTrue(wordDictionary.search(".ad")); // should return True

        // Test searching words with multiple wildcards '..'
        assertTrue(wordDictionary.search("b..")); // should return True
    }

    @Test
    public void testWordDictionaryWithEmptyInput() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test searching an empty word
        assertFalse(wordDictionary.search("")); // should return False
    }

    @Test
    public void testWordDictionaryWithWildcardOnly() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test searching with only wildcards
        assertFalse(wordDictionary.search(".a.")); // should return False
    }

    @Test
    public void testWordDictionaryWithNonExistingWord() {
        WordDictionary wordDictionary = new WordDictionary();

        // Test searching a non-existing word
        assertFalse(wordDictionary.search("nonexistent")); // should return False
    }

}