package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLinkedListTwoTest {
    @Test
    public void testReverseBetweenExample1() {
        // Input: 1 -> 2 -> 3 -> 4 -> 5, left = 2, right = 4
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseLinkedListTwo solution = new ReverseLinkedListTwo();
        ListNode result = solution.reverseBetween(head, 2, 4);

        // Expected output: 1 -> 4 -> 3 -> 2 -> 5
        ListNode expected = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5)))));
        assertLinkedListEquals(expected, result);
    }

    @Test
    public void testReverseBetweenExample2() {
        // Input: 5, left = 1, right = 1
        ListNode head = new ListNode(5);
        ReverseLinkedListTwo solution = new ReverseLinkedListTwo();
        ListNode result = solution.reverseBetween(head, 1, 1);

        // Expected output: 5
        ListNode expected = new ListNode(5);
        assertLinkedListEquals(expected, result);
    }

    // Helper method to compare two linked lists
    private void assertLinkedListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }

}