package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveNthNodeFromEndOfListTest {
    @Test
    void testRemoveNthFromEnd() {
        RemoveNthNodeFromEndOfList solution = new RemoveNthNodeFromEndOfList();

        // Example 1
        ListNode input1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode expected1 = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5))));
        ListNode result1 = solution.removeNthFromEnd(input1, 2);
        assertListNodesEqual(expected1, result1);

        // Example 2
        ListNode input2 = new ListNode(1);
        ListNode expected2 = null; // Empty list
        ListNode result2 = solution.removeNthFromEnd(input2, 1);
        assertListNodesEqual(expected2, result2);

        // Example 3
        ListNode input3 = new ListNode(1, new ListNode(2));
        ListNode expected3 = new ListNode(1);
        ListNode result3 = solution.removeNthFromEnd(input3, 1);
        assertListNodesEqual(expected3, result3);
    }

    // Helper method to compare ListNode objects
    private void assertListNodesEqual(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }

        // Both should be null at this point
        assertNull(expected);
        assertNull(actual);
    }

}