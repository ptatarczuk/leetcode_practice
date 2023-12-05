package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinarySearchTreeTest {
    @Test
    public void testIsValidBST_Example1() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        assertTrue(validator.isValidBST(root));
    }

    @Test
    public void testIsValidBST_Example2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        ValidateBinarySearchTree validator = new ValidateBinarySearchTree();
        assertFalse(validator.isValidBST(root));
    }

}