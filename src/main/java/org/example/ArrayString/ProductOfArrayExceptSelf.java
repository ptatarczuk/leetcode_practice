package org.example.ArrayString;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
You must write an algorithm that runs in O(n) time and without using the division operation.
*/

public class ProductOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int N = nums.length;

        int[] left_products = new int[N];
        int[] right_products = new int[N];

        int[] outputarray = new int[N];

        left_products[0] = 1;
        right_products[N-1] = 1;

        for (int i = 1; i < N; i++) {
            left_products[i] = nums[i-1] * left_products[i-1];
        }
        for (int i = N - 2; i >= 0; i--) {
            right_products[i] = nums[i+1] * right_products[i+1];
        }
        for (int i = 0; i < N; i++) {
            outputarray[i] = left_products[i] * right_products[i];
        }
        return outputarray;
    }
}
