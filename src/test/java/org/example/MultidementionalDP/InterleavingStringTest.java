package org.example.MultidementionalDP;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterleavingStringTest {
    @Test
    public void testIsInterleave_Example1() {
        InterleavingString interleavingString = new InterleavingString();
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbcbcac";
        assertTrue(interleavingString.isInterleave(s1, s2, s3));
    }

    @Test
    public void testIsInterleave_Example2() {
        InterleavingString interleavingString = new InterleavingString();
        String s1 = "aabcc";
        String s2 = "dbbca";
        String s3 = "aadbbbaccc";
        assertFalse(interleavingString.isInterleave(s1, s2, s3));
    }

    @Test
    public void testIsInterleave_Example3() {
        InterleavingString interleavingString = new InterleavingString();
        String s1 = "";
        String s2 = "";
        String s3 = "";
        assertTrue(interleavingString.isInterleave(s1, s2, s3));
    }

    @Test
    public void testIsInterleave_EmptyStrings() {
        InterleavingString interleavingString = new InterleavingString();
        String s1 = "";
        String s2 = "";
        String s3 = "abc";
        assertFalse(interleavingString.isInterleave(s1, s2, s3));
    }

    @Test
    public void testIsInterleave_DifferentLengths() {
        InterleavingString interleavingString = new InterleavingString();
        String s1 = "abc";
        String s2 = "def";
        String s3 = "abcdefgh";
        assertFalse(interleavingString.isInterleave(s1, s2, s3));
    }
}