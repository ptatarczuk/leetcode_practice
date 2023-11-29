package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AverageOfLevelsInBinaryTreeTest {
    @Test
    void testAverageOfLevelsExample1() {
        // Input: [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        AverageOfLevelsInBinaryTree solution = new AverageOfLevelsInBinaryTree();
        List<Double> result = solution.averageOfLevels(root);

        // Output: [3.00000,14.50000,11.00000]
        assertEquals(List.of(3.0, 14.5, 11.0), result);
    }

    @Test
    void testAverageOfLevelsExample2() {
        // Input: [3,9,20,15,7]
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        AverageOfLevelsInBinaryTree solution = new AverageOfLevelsInBinaryTree();
        List<Double> result = solution.averageOfLevels(root);

        // Output: [3.00000,14.50000,11.00000]
        assertEquals(List.of(3.0, 14.5, 11.0), result);
    }

}