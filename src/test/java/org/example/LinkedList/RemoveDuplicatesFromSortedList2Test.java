package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromSortedList2Test {
    @Test
    public void testDeleteDuplicates() {
        RemoveDuplicatesFromSortedList2 solution = new RemoveDuplicatesFromSortedList2();

        // Example 1
        ListNode input1 = createLinkedList(new int[]{1, 2, 3, 3, 4, 4, 5});
        ListNode expected1 = createLinkedList(new int[]{1, 2, 5});
        ListNode result1 = solution.deleteDuplicates(input1);
        assertLinkedListEquals(expected1, result1);

        // Example 2
        ListNode input2 = createLinkedList(new int[]{1, 1, 1, 2, 3});
        ListNode expected2 = createLinkedList(new int[]{2, 3});
        ListNode result2 = solution.deleteDuplicates(input2);
        assertLinkedListEquals(expected2, result2);
    }

    // Helper method to create a linked list from an array of values
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to compare two linked lists
    private void assertLinkedListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected, "Expected list is longer");
        assertNull(actual, "Actual list is longer");
    }
}