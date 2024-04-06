package org.example.DivideAndConquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {
    @Test
    public void testMergeKLists_Example1() {
        MergeKSortedLists merger = new MergeKSortedLists();
        ListNode[] lists = new ListNode[3];
        lists[0] = createList(new int[]{1, 4, 5});
        lists[1] = createList(new int[]{1, 3, 4});
        lists[2] = createList(new int[]{2, 6});
        ListNode expected = createList(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        ListNode result = merger.mergeKLists(lists);
        assertTrue(compareLists(expected, result));
    }

    @Test
    public void testMergeKLists_Example2() {
        MergeKSortedLists merger = new MergeKSortedLists();
        ListNode[] lists = new ListNode[0];
        ListNode expected = null;
        ListNode result = merger.mergeKLists(lists);
        assertEquals(expected, result);
    }

    @Test
    public void testMergeKLists_Example3() {
        MergeKSortedLists merger = new MergeKSortedLists();
        ListNode[] lists = new ListNode[1];
        lists[0] = createList(new int[]{});
        ListNode expected = null;
        ListNode result = merger.mergeKLists(lists);
        assertEquals(expected, result);
    }

    // Helper method to create a ListNode from an array of integers
    private ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to compare two lists
    private boolean compareLists(ListNode l1, ListNode l2) {
        while (l1 != null && l2 != null) {
            if (l1.val != l2.val)
                return false;
            l1 = l1.next;
            l2 = l2.next;
        }
        return l1 == null && l2 == null;
    }

}