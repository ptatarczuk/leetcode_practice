package org.example.DivideAndConquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConvertSortedArrayToBinaryTreeTest {
    @Test
    public void testSortedArrayToBST() {
        ConvertSortedArrayToBinaryTree converter = new ConvertSortedArrayToBinaryTree();

        // Test case 1: Empty array
        int[] nums1 = {};
        assertNull(converter.sortedArrayToBST(nums1));

        // Test case 2: Array with one element
        int[] nums2 = {1};
        TreeNode result2 = converter.sortedArrayToBST(nums2);
        assertEquals(1, result2.val);
        assertNull(result2.left);
        assertNull(result2.right);

        // Test case 3: Array with multiple elements
        int[] nums3 = {-10, -3, 0, 5, 9};
        TreeNode result3 = converter.sortedArrayToBST(nums3);
        assertEquals(0, result3.val);
        assertEquals(-3, result3.left.val);
        assertEquals(-10, result3.left.left.val);
        assertNull(result3.left.right);
        assertEquals(9, result3.right.val);
        assertEquals(5, result3.right.left.val);
        assertNull(result3.right.right);
    }

}