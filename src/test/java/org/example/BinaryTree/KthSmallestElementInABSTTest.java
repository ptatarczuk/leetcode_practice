package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KthSmallestElementInABSTTest {
    @Test
    public void testKthSmallestExample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        KthSmallestElementInABST solution = new KthSmallestElementInABST();
        int result = solution.kthSmallest(root, 1);

        assertEquals(1, result);
    }

    @Test
    public void testKthSmallestExample2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);

        KthSmallestElementInABST solution = new KthSmallestElementInABST();
        int result = solution.kthSmallest(root, 3);

        assertEquals(3, result);
    }

}