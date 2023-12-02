package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeZigZagLevelOrderTraversalTest {
    @Test
    public void testZigzagLevelOrderExample1() {
        // Input: [3,9,20,null,null,15,7]
        // Output: [[3],[20,9],[15,7]]
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        BinaryTreeZigZagLevelOrderTraversal solution = new BinaryTreeZigZagLevelOrderTraversal();
        List<List<Integer>> result = solution.zigzagLevelOrder(root);
        assertEquals(3, result.size());
        assertEquals(List.of(3), result.get(0));
        assertEquals(List.of(20, 9), result.get(1));
        assertEquals(List.of(15, 7), result.get(2));
    }

    @Test
    public void testZigzagLevelOrderExample2() {
        // Input: [1]
        // Output: [[1]]
        TreeNode root = new TreeNode(1);
        BinaryTreeZigZagLevelOrderTraversal solution = new BinaryTreeZigZagLevelOrderTraversal();
        List<List<Integer>> result = solution.zigzagLevelOrder(root);
        assertEquals(1, result.size());
        assertEquals(List.of(1), result.get(0));
    }

    @Test
    public void testZigzagLevelOrderExample3() {
        // Input: []
        // Output: []
        TreeNode root = null;
        BinaryTreeZigZagLevelOrderTraversal solution = new BinaryTreeZigZagLevelOrderTraversal();
        List<List<Integer>> result = solution.zigzagLevelOrder(root);
        assertEquals(0, result.size());
    }

}