package org.example.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (k == 0) return false;

        Map<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            if (hashMap.containsKey(val) && i - hashMap.get(val) <= k) {
                return true;
            }
            hashMap.put(val,i);
        }
        return false;
    }
}
