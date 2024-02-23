package org.example.MultidementionalDP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EditDistanceTest {
    @Test
    public void testExample1() {
        EditDistance editDistance = new EditDistance();
        String word1 = "horse";
        String word2 = "ros";
        int result = editDistance.minDistance(word1, word2);
        assertEquals(3, result);
    }

    @Test
    public void testExample2() {
        EditDistance editDistance = new EditDistance();
        String word1 = "intention";
        String word2 = "execution";
        int result = editDistance.minDistance(word1, word2);
        assertEquals(5, result);
    }

    @Test
    public void testEmptyStrings() {
        EditDistance editDistance = new EditDistance();
        String word1 = "";
        String word2 = "";
        int result = editDistance.minDistance(word1, word2);
        assertEquals(0, result);
    }

    @Test
    public void testDifferentLengthStrings() {
        EditDistance editDistance = new EditDistance();
        String word1 = "abc";
        String word2 = "abcd";
        int result = editDistance.minDistance(word1, word2);
        assertEquals(1, result);
    }

    @Test
    public void testSameStrings() {
        EditDistance editDistance = new EditDistance();
        String word1 = "abc";
        String word2 = "abc";
        int result = editDistance.minDistance(word1, word2);
        assertEquals(0, result);
    }

    @Test
    public void testSingleCharacterDifference() {
        EditDistance editDistance = new EditDistance();
        String word1 = "abcd";
        String word2 = "abed";
        int result = editDistance.minDistance(word1, word2);
        assertEquals(1, result);
    }

}