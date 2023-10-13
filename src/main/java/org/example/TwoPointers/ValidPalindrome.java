package org.example.TwoPointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String clean = s.toLowerCase().replaceAll("[^A-Za-z]", "");

        int left = 0;
        int right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
