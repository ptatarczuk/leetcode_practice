package org.example.BinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PopulatingNextRightPointersTest {

    private boolean areNodesConnected(Node start, int[] values) {
        for (int value : values) {
            if (start == null || start.val != value) {
                return false;
            }
            start = start.next;
        }
        return start == null;
    }

    @Test
    public void testConnect() {
        // Create a sample binary tree
        //     1
        //    / \
        //   2   3
        //  / \   \
        // 4   5   7
        Node root = new Node(1,
                new Node(2, new Node(4), new Node(5), null),
                new Node(3, null, new Node(7), null),
                null);

        PopulatingNextRightPointers solution = new PopulatingNextRightPointers();
        Node connectedRoot = solution.connect(root);

        // Validate the next pointers
        assertTrue(areNodesConnected(connectedRoot, new int[]{1}));
        assertTrue(areNodesConnected(connectedRoot.left, new int[]{2, 3}));
        assertTrue(areNodesConnected(connectedRoot.left.left, new int[]{4, 5, 7}));
    }
}