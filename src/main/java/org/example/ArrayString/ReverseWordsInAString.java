package org.example.ArrayString;

/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
*/
public class ReverseWordsInAString {
    public String reverseWords(String s) {
        int i = 0, j = s.length() - 1;
        while (i <= j && s.charAt(i) == ' ') i++;
        while (j >= i && s.charAt(j) == ' ') j--;
        s = s.substring(i, j + 1);

        String[] words = s.split("\\s+");
        StringBuilder out = new StringBuilder();

        for (int k = words.length - 1; k > 0; k--) {
            out.append(words[k]).append(" ");
        }
        return out.append(words[0]).toString();
    }
}
