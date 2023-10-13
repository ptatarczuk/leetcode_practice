package org.example.ArrayString;

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
*/

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] str) {
        if (str.length == 0) return "";
        String prefix = str[0];

        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() -1);
            }
        }
        return prefix;
    }
}

