package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeLevelOrderTraversalTest {
    @Test
    public void testLevelOrderExample1() {
        // Input: [3,9,20,null,null,15,7]
        // Output: [[3],[9,20],[15,7]]
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = solution.levelOrder(root);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15, 7));

        assertEquals(expected, result);
    }

    @Test
    public void testLevelOrderExample2() {
        // Input: [1]
        // Output: [[1]]
        TreeNode root = new TreeNode(1);

        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = solution.levelOrder(root);

        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));

        assertEquals(expected, result);
    }

    @Test
    public void testLevelOrderExample3() {
        // Input: []
        // Output: []
        TreeNode root = null;

        BinaryTreeLevelOrderTraversal solution = new BinaryTreeLevelOrderTraversal();
        List<List<Integer>> result = solution.levelOrder(root);

        List<List<Integer>> expected = new ArrayList<>();

        assertEquals(expected, result);
    }

}