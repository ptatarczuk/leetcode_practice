package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FlattenBinaryTreeToLinkedListTest {
    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2,
                        new TreeNode(3),
                        new TreeNode(4)),
                new TreeNode(5,
                        null,
                        new TreeNode(6)));

        FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();
        solution.flatten(root);

        // Check the flattened tree
        assertEquals(1, root.val);
        assertNull(root.left);

        TreeNode current = root.right;
        for (int i = 2; i <= 6; i++) {
            assertNotNull(current);
            assertEquals(i, current.val);
            assertNull(current.left);
            current = current.right;
        }
        assertNull(current);
    }

    @Test
    public void testExample2() {
        TreeNode root = null;

        FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();
        solution.flatten(root);

        // Check that the tree is still null
        assertNull(root);
    }

    @Test
    public void testExample3() {
        TreeNode root = new TreeNode(0);

        FlattenBinaryTreeToLinkedList solution = new FlattenBinaryTreeToLinkedList();
        solution.flatten(root);

        // Check the flattened tree
        assertEquals(0, root.val);
        assertNull(root.left);
        assertNull(root.right);
    }

}