package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeMaximumPathSumTest {
    @Test
    public void testMaxPathSum_Example1() {
        // Create tree: [1,2,3]
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();
        int expected = 6;
        int result = solution.maxPathSum(root);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxPathSum_Example2() {
        // Create tree: [-10,9,20,null,null,15,7]
        TreeNode root = new TreeNode(-10);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();
        int expected = 42;
        int result = solution.maxPathSum(root);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxPathSum_EmptyTree() {
        // Empty tree
        BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();
        int expected = Integer.MIN_VALUE; // Since the tree is empty, the maximum path sum should be Integer.MIN_VALUE
        int result = solution.maxPathSum(null);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxPathSum_SingleNode() {
        // Single node tree: [5]
        TreeNode root = new TreeNode(5);
        BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();
        int expected = 5; // Only one node, so the maximum path sum is the value of the node itself
        int result = solution.maxPathSum(root);
        assertEquals(expected, result);
    }

    @Test
    public void testMaxPathSum_AllNegativeValues() {
        // Tree with all negative values: [-2,-1,-3]
        TreeNode root = new TreeNode(-2);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-3);

        BinaryTreeMaximumPathSum solution = new BinaryTreeMaximumPathSum();
        int expected = -1; // The path with the highest value is [-1]
        int result = solution.maxPathSum(root);
        assertEquals(expected, result);
    }

}