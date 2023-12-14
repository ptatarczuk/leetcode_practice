package org.example.Trie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ImplementTrieTest {
    @Test
    public void testTrieOperations() {
        ImplementTrie trie = new ImplementTrie();

        // Insert "apple" into the Trie
        trie.insert("apple");
        // Check if "apple" is in the Trie
        assertTrue(trie.search("apple"));
        // Check if "app" is in the Trie (prefix of "apple")
        assertFalse(trie.search("app"));
        // Check if "app" is a prefix in the Trie
        assertTrue(trie.startsWith("app"));

        // Insert "app" into the Trie
        trie.insert("app");
        // Check if "app" is in the Trie
        assertTrue(trie.search("app"));
    }

}