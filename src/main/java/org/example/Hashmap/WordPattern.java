package org.example.Hashmap;
import java.util.HashMap;

/*
Given a pattern and a string s, find if s follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
*/

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;

        HashMap<Character, String> aMap = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            char current_char = pattern.charAt(i);
            if (aMap.containsKey(current_char)) {
                if (!aMap.get(current_char).equals(words[i])) {
                    return false;
                }
            } else {
                if (aMap.containsValue(words[i])) {
                    return false;
                }
                aMap.put(current_char, words[i]);
            }
        }
        return true;
    }
}
