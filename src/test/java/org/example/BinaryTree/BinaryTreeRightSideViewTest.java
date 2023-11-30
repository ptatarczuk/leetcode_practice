package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeRightSideViewTest {
    @Test
    void testExample1() {
        TreeNode root = new TreeNode(1,
                new TreeNode(2, null, new TreeNode(5)),
                new TreeNode(3, null, new TreeNode(4)));

        BinaryTreeRightSideView solution = new BinaryTreeRightSideView();
        List<Integer> result = solution.rightSideView(root);

        assertEquals(List.of(1, 3, 4), result);
    }

    @Test
    void testExample2() {
        TreeNode root = new TreeNode(1, null, new TreeNode(3));

        BinaryTreeRightSideView solution = new BinaryTreeRightSideView();
        List<Integer> result = solution.rightSideView(root);

        assertEquals(List.of(1, 3), result);
    }

    @Test
    void testExample3() {
        TreeNode root = null;

        BinaryTreeRightSideView solution = new BinaryTreeRightSideView();
        List<Integer> result = solution.rightSideView(root);

        assertEquals(List.of(), result);
    }

}