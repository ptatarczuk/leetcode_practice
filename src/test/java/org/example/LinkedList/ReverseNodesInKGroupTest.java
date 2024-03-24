package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNodesInKGroupTest {
    @Test
    public void testReverseKGroupExample1() {
        ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

        // Input: head = [1,2,3,4,5], k = 2
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode expectedResult = createLinkedList(new int[]{2, 1, 4, 3, 5});
        ListNode result = solution.reverseKGroup(head, 2);

        assertLinkedListEquals(expectedResult, result);
    }

    @Test
    public void testReverseKGroupExample2() {
        ReverseNodesInKGroup solution = new ReverseNodesInKGroup();

        // Input: head = [1,2,3,4,5], k = 3
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        ListNode expectedResult = createLinkedList(new int[]{3, 2, 1, 4, 5});
        ListNode result = solution.reverseKGroup(head, 3);

        assertLinkedListEquals(expectedResult, result);
    }

    // Helper method to create a linked list from an array
    private ListNode createLinkedList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int num : arr) {
            current.next = new ListNode(num);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to assert if two linked lists are equal
    private void assertLinkedListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assert actual.val == expected.val;
            expected = expected.next;
            actual = actual.next;
        }
        assert expected == null && actual == null;
    }

}