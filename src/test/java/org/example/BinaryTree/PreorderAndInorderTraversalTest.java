package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PreorderAndInorderTraversalTest {
    @Test
    public void testBuildTreeExample2() {
        PreorderAndInorderTraversal solution = new PreorderAndInorderTraversal();
        int[] preorder = {-1};
        int[] inorder = {-1};

        TreeNode result = solution.buildTree(preorder, inorder);

        // Construct the expected tree: [-1]
        TreeNode expected = new TreeNode(-1);

        assertTrue(isSameTree(expected, result));
    }

    // Helper method to check if two trees are identical
    private boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        } else {
            return (p.val == q.val) && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
    }

}