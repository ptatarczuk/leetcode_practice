package org.example.DivideAndConquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortListTest {

    @Test
    public void testSortList() {
        // Test case 1
        ListNode head1 = createLinkedList(new int[]{4, 2, 1, 3});
        ListNode result1 = new SortList().sortList(head1);
        assertLinkedListEquals(result1, createLinkedList(new int[]{1, 2, 3, 4}));

        // Test case 2
        ListNode head2 = createLinkedList(new int[]{-1, 5, 3, 4, 0});
        ListNode result2 = new SortList().sortList(head2);
        assertLinkedListEquals(result2, createLinkedList(new int[]{-1, 0, 3, 4, 5}));

        // Test case 3
        ListNode head3 = null;
        ListNode result3 = new SortList().sortList(head3);
        assertNull(result3);
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

    // Helper method to assert that two linked lists are equal
    private void assertLinkedListEquals(ListNode actual, ListNode expected) {
        while (actual != null && expected != null) {
            assertEquals(expected.val, actual.val);
            actual = actual.next;
            expected = expected.next;
        }

        assertNull(actual, "Actual list has extra elements");
        assertNull(expected, "Expected list has extra elements");
    }


}