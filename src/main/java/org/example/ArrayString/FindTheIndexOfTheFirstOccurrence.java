package org.example.ArrayString;

/*
Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
*/

public class FindTheIndexOfTheFirstOccurrence {
    public int strStr(String haystack, String needle) {
        // FASTER WAY IF YOU CAN USE BUILT-IN JS FUNCTIONS
/*        if (haystack.length() == 0) return 0;
        if (haystack.contains(needle)) return haystack.indexOf(needle);
        return -1;*/

        if (haystack.length() == 0 || needle.length() == 0) return 0;
        int count = 0;

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(count)) count++ ;
            else {
                i -= count;
                count = 0;
            }
            if (count == needle.length()) return i -= count -1;
        }
        return -1;
    }
}
