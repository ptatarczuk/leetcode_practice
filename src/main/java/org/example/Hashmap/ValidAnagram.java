package org.example.Hashmap;
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.
An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
*/

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] char_count = new int[26];
        for (int i = 0; i < s.length(); i++){
            char_count[s.charAt(i)-'a']++;
            char_count[t.charAt(i)-'a']--;
        }
        for (int count : char_count) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}
