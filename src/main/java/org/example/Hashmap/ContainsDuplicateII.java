package org.example.Hashmap;

import java.util.HashMap;
import java.util.Map;

/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
*/

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (hashMap.containsKey(val) && i - hashMap.get(val) <= k) {
                return true;
            }
            hashMap.put(val, i);
        }
        return false;
    }
}
