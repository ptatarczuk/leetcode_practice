package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CopyListWithRandomPointerTest {
    @Test
    void copyRandomList() {
        CopyListWithRandomPointer solution = new CopyListWithRandomPointer();

        // Example 1
        NodeCopy head1 = createLinkedList(new int[][]{{7, -1}, {13, 0}, {11, 4}, {10, 2}, {1, 0}});
        NodeCopy result1 = solution.copyRandomList(head1);
        assertLinkedListEquals(head1, result1);

        // Example 2
        NodeCopy head2 = createLinkedList(new int[][]{{1, 1}, {2, 1}});
        NodeCopy result2 = solution.copyRandomList(head2);
        assertLinkedListEquals(head2, result2);

        // Example 3
        NodeCopy head3 = createLinkedList(new int[][]{{3, -1}, {3, 0}, {3, -1}});
        NodeCopy result3 = solution.copyRandomList(head3);
        assertLinkedListEquals(head3, result3);
    }

    // Helper method to create a linked list from an array of values and random indices
    private NodeCopy createLinkedList(int[][] valuesAndRandom) {
        if (valuesAndRandom == null || valuesAndRandom.length == 0) {
            return null;
        }

        HashMap<Integer, NodeCopy> indexToNode = new HashMap<>();

        NodeCopy head = new NodeCopy(valuesAndRandom[0][0]);
        indexToNode.put(0, head);

        NodeCopy current = head;

        for (int i = 1; i < valuesAndRandom.length; i++) {
            current.next = new NodeCopy(valuesAndRandom[i][0]);
            indexToNode.put(i, current.next);
            current = current.next;
        }

        for (int i = 0; i < valuesAndRandom.length; i++) {
            if (valuesAndRandom[i][1] != -1) {
                indexToNode.get(i).random = indexToNode.get(valuesAndRandom[i][1]);
            }
        }

        return head;
    }

    // Helper method to assert equality between two linked lists
    private void assertLinkedListEquals(NodeCopy expected, NodeCopy actual) {
        while (expected != null) {
            assertEquals(expected.val, actual.val);
            if (expected.random != null) {
                assertEquals(expected.random.val, actual.random.val);
            } else {
                assertNull(actual.random);
            }
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(actual);
    }

}