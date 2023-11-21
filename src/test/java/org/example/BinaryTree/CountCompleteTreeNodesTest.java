package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountCompleteTreeNodesTest {
    @Test
    public void testCountNodesExample1() {
        // Input: [1,2,3,4,5,6]
        // Output: 6
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);

        CountCompleteTreeNodes counter = new CountCompleteTreeNodes();
        int result = counter.countNodes(root);

        assertEquals(6, result);
    }

    @Test
    public void testCountNodesExample2() {
        // Input: []
        // Output: 0
        TreeNode root = null;

        CountCompleteTreeNodes counter = new CountCompleteTreeNodes();
        int result = counter.countNodes(root);

        assertEquals(0, result);
    }

    @Test
    public void testCountNodesExample3() {
        // Input: [1]
        // Output: 1
        TreeNode root = new TreeNode(1);

        CountCompleteTreeNodes counter = new CountCompleteTreeNodes();
        int result = counter.countNodes(root);

        assertEquals(1, result);
    }


}