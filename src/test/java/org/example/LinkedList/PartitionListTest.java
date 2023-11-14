package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PartitionListTest {
    @Test
    public void testPartition() {
        // Example 1
        ListNode input1 = createListNode(new int[]{1, 4, 3, 2, 5, 2});
        int x1 = 3;
        ListNode expected1 = createListNode(new int[]{1, 2, 2, 4, 3, 5});
        testHelper(input1, x1, expected1);

        // Example 2
        ListNode input2 = createListNode(new int[]{2, 1});
        int x2 = 2;
        ListNode expected2 = createListNode(new int[]{1, 2});
        testHelper(input2, x2, expected2);

        // Additional test cases can be added as needed
    }

    private void testHelper(ListNode input, int x, ListNode expected) {
        PartitionList partitionList = new PartitionList();
        ListNode result = partitionList.partition(input, x);
        assertListEquals(expected, result);
    }

    private void assertListEquals(ListNode expected, ListNode actual) {
        while (expected != null && actual != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }

        assertNull(expected, "Expected list is longer");
        assertNull(actual, "Actual list is longer");
    }

    private ListNode createListNode(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }
}