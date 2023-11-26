package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumRootToLeafNumbersTest {
    @Test
    public void testSumNumbersExample1() {
        TreeNode root = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        int result = sumRootToLeafNumbers.sumNumbers(root);
        assertEquals(25, result);
    }

    @Test
    public void testSumNumbersExample2() {
        TreeNode root = new TreeNode(4,
                new TreeNode(9, new TreeNode(5), new TreeNode(1)),
                new TreeNode(0));
        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        int result = sumRootToLeafNumbers.sumNumbers(root);
        assertEquals(1026, result);
    }

    @Test
    public void testSumNumbersEmptyTree() {
        SumRootToLeafNumbers sumRootToLeafNumbers = new SumRootToLeafNumbers();
        int result = sumRootToLeafNumbers.sumNumbers(null);
        assertEquals(0, result);
    }

}