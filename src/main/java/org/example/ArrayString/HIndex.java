package org.example.ArrayString;

import java.util.Arrays;

/*
Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.
According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.
*/

public class HIndex {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;

        int idx = 0 ;

        while(idx < n &&  n-idx >citations[idx]){
            idx++;
        }

        return n-idx;
    }
}
