package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumAbsoluteDifferenceInBSTTest {
    @Test
    public void testExample1() {
        TreeNode root = new TreeNode(4,
                new TreeNode(2, new TreeNode(1), new TreeNode(3)),
                new TreeNode(6));

        MinimumAbsoluteDifferenceInBST solution = new MinimumAbsoluteDifferenceInBST();
        int result = solution.getMinimumDifference(root);

        assertEquals(1, result);
    }

    @Test
    public void testExample2() {
        TreeNode root = new TreeNode(1,
                new TreeNode(0),
                new TreeNode(48, null, new TreeNode(12, null, new TreeNode(49))));

        MinimumAbsoluteDifferenceInBST solution = new MinimumAbsoluteDifferenceInBST();
        int result = solution.getMinimumDifference(root);

        assertEquals(1, result);
    }

}
