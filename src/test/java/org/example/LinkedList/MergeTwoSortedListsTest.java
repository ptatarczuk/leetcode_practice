package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
    @Test
    public void testMergeTwoListsExample1() {
        ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode expectedResult = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

        MergeTwoSortedLists merger = new MergeTwoSortedLists();
        ListNode mergedList = merger.mergeTwoLists(l1, l2);

        assertArrayEquals(listToArray(expectedResult), listToArray(mergedList));
    }

    @Test
    public void testMergeTwoListsExample2() {
        ListNode l1 = null;
        ListNode l2 = null;
        ListNode expectedResult = null;

        MergeTwoSortedLists merger = new MergeTwoSortedLists();
        ListNode mergedList = merger.mergeTwoLists(l1, l2);

        assertArrayEquals(listToArray(expectedResult), listToArray(mergedList));
    }

    @Test
    public void testMergeTwoListsExample3() {
        ListNode l1 = null;
        ListNode l2 = new ListNode(0);
        ListNode expectedResult = new ListNode(0);

        MergeTwoSortedLists merger = new MergeTwoSortedLists();
        ListNode mergedList = merger.mergeTwoLists(l1, l2);

        assertArrayEquals(listToArray(expectedResult), listToArray(mergedList));
    }

    // Helper method to convert a ListNode to an integer array
    private int[] listToArray(ListNode list) {
        int size = 0;
        ListNode current = list;
        while (current != null) {
            size++;
            current = current.next;
        }

        int[] result = new int[size];
        current = list;
        for (int i = 0; i < size; i++) {
            result[i] = current.val;
            current = current.next;
        }

        return result;
    }

}