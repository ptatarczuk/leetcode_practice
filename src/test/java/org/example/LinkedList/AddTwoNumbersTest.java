package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    @Test
    public void testExample1() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode l1 = createLinkedList(new int[]{2, 4, 3});
        ListNode l2 = createLinkedList(new int[]{5, 6, 4});
        ListNode expected = createLinkedList(new int[]{7, 0, 8});
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertLinkedListEquals(expected, result);
    }

    @Test
    public void testExample2() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode l1 = createLinkedList(new int[]{0});
        ListNode l2 = createLinkedList(new int[]{0});
        ListNode expected = createLinkedList(new int[]{0});
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertLinkedListEquals(expected, result);
    }

    @Test
    public void testExample3() {
        AddTwoNumbers solution = new AddTwoNumbers();
        ListNode l1 = createLinkedList(new int[]{9, 9, 9, 9, 9, 9, 9});
        ListNode l2 = createLinkedList(new int[]{9, 9, 9, 9});
        ListNode expected = createLinkedList(new int[]{8, 9, 9, 9, 0, 0, 0, 1});
        ListNode result = solution.addTwoNumbers(l1, l2);
        assertLinkedListEquals(expected, result);
    }

    // Helper method to create a linked list from an array of integers
    private ListNode createLinkedList(int[] values) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummyHead.next;
    }

    // Helper method to assert if two linked lists are equal
    private void assertLinkedListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertEquals(expected, actual);
    }

}