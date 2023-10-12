package org.example.ArrayString;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;

        int newSize = 0;
        for (int i = 0; i<nums.length; i++) {
            if (nums[i] != val) {
                nums[newSize] = nums[i];
                newSize++;
            }
        }
        return newSize;
    }


}
