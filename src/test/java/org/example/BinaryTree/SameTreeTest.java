package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SameTreeTest {

    @Test
    public void testSameTrees() {
        SameTree solution = new SameTree();

        // Example 1
        TreeNode p1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        assertTrue(solution.isSameTree(p1, q1));

        // Example 2
        TreeNode p2 = new TreeNode(1, new TreeNode(2), null);
        TreeNode q2 = new TreeNode(1, null, new TreeNode(2));
        assertFalse(solution.isSameTree(p2, q2));

        // Example 3
        TreeNode p3 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
        TreeNode q3 = new TreeNode(1, new TreeNode(1), new TreeNode(2));
        assertFalse(solution.isSameTree(p3, q3));
    }

    @Test
    public void testEmptyTrees() {
        SameTree solution = new SameTree();

        // Both trees are empty, should return true
        assertTrue(solution.isSameTree(null, null));

        // One tree is empty, the other is not, should return false
        TreeNode p = new TreeNode(1);
        assertFalse(solution.isSameTree(p, null));
    }

    @Test
    public void testUnequalSizes() {
        SameTree solution = new SameTree();

        // Trees have different sizes, should return false
        TreeNode p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        TreeNode q = new TreeNode(1, new TreeNode(2));
        assertFalse(solution.isSameTree(p, q));
    }
}