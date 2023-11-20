package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PathSumTest {
    @Test
    public void testPathSum() {
        // Example 1
        TreeNode root1 = new TreeNode(5);
        root1.left = new TreeNode(4);
        root1.right = new TreeNode(8);
        root1.left.left = new TreeNode(11);
        root1.left.left.left = new TreeNode(7);
        root1.left.left.right = new TreeNode(2);
        root1.right.left = new TreeNode(13);
        root1.right.right = new TreeNode(4);
        root1.right.right.right = new TreeNode(1);

        PathSum pathSum1 = new PathSum();
        assertTrue(pathSum1.hasPathSum(root1, 22));

        // Example 2
        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        PathSum pathSum2 = new PathSum();
        assertFalse(pathSum2.hasPathSum(root2, 5));

        // Example 3
        TreeNode root3 = null;

        PathSum pathSum3 = new PathSum();
        assertFalse(pathSum3.hasPathSum(root3, 0));
    }

}