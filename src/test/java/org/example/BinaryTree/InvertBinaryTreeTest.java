package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvertBinaryTreeTest {
    @Test
    public void testInvertTree() {
        // Example 1
        TreeNode root1 = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(7,
                        new TreeNode(6),
                        new TreeNode(9)));
        InvertBinaryTree solution = new InvertBinaryTree();
        TreeNode invertedRoot1 = solution.invertTree(root1);
        TreeNode expected1 = new TreeNode(4,
                new TreeNode(7,
                        new TreeNode(9),
                        new TreeNode(6)),
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(1)));
        assertTrue(isSameTree(invertedRoot1, expected1));

        // Example 2
        TreeNode root2 = new TreeNode(2,
                new TreeNode(1),
                new TreeNode(3));
        TreeNode invertedRoot2 = solution.invertTree(root2);
        TreeNode expected2 = new TreeNode(2,
                new TreeNode(3),
                new TreeNode(1));
        assertTrue(isSameTree(invertedRoot2, expected2));

        // Example 3
        TreeNode root3 = null; // Empty tree
        TreeNode invertedRoot3 = solution.invertTree(root3);
        assertNull(invertedRoot3);
    }

    // Helper method to check if two trees are the same
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

}