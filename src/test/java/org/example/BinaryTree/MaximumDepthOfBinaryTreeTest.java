package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumDepthOfBinaryTreeTest {

    @Test
    public void testMaxDepth() {
        // Example 1
        TreeNode root1 = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        MaximumDepthOfBinaryTree solution = new MaximumDepthOfBinaryTree();
        int result1 = solution.maxDepth(root1);
        assertEquals(3, result1);

        // Example 2
        TreeNode root2 = new TreeNode(1, null, new TreeNode(2));
        int result2 = solution.maxDepth(root2);
        assertEquals(2, result2);
    }
}