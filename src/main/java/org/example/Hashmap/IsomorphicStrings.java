package org.example.Hashmap;

/*
Given two strings s and t, determine if they are isomorphic.
Two strings s and t are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters.
No two characters may map to the same character, but a character may map to itself.
*/

import java.util.HashMap;

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;

        HashMap<Character, Character> characterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char oldChar = s.charAt(i);
            char newChar = t.charAt(i);

            if (!characterMap.containsKey(oldChar)) {
                if (!characterMap.containsValue(newChar)) characterMap.put(oldChar, newChar);
                else return false;
            }
            else if (characterMap.get(oldChar) != newChar) return false;
        }
    return true;
    }
}
