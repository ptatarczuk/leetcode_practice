package org.example.Hashmap;
import java.util.HashMap;

/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
Each letter in magazine can only be used once in ransomNote.
*/


public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> counts = new HashMap<>();

        for (char c : magazine.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!counts.containsKey(c) || counts.get(c) <= 0) {
                return false;
            }
            counts.put(c, counts.get(c) - 1);
        }
        return true;
    }
}
