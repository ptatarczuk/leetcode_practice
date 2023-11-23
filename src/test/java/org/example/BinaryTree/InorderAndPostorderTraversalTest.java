package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InorderAndPostorderTraversalTest {
    @Test
    public void testBuildTree() {
        InorderAndPostorderTraversal solution = new InorderAndPostorderTraversal();

        // Example 1
        int[] inorder1 = {9, 3, 15, 20, 7};
        int[] postorder1 = {9, 15, 7, 20, 3};
        TreeNode result1 = solution.buildTree(inorder1, postorder1);
        TreeNode expected1 = buildExpectedTree1();
        assertTrue(isSameTree(expected1, result1));

        // Example 2
        int[] inorder2 = {-1};
        int[] postorder2 = {-1};
        TreeNode result2 = solution.buildTree(inorder2, postorder2);
        TreeNode expected2 = buildExpectedTree2();
        assertTrue(isSameTree(expected2, result2));
    }

    // Helper method to build the expected tree for Example 1
    private TreeNode buildExpectedTree1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        return root;
    }

    // Helper method to build the expected tree for Example 2
    private TreeNode buildExpectedTree2() {
        return new TreeNode(-1);
    }

    // Helper method to check if two trees are the same
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}