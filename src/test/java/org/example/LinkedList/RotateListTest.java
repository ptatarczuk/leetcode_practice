package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RotateListTest {
    @Test
    public void testRotateRightExample1() {
        // Input: head = [1,2,3,4,5], k = 2
        // Output: [4,5,1,2,3]
        ListNode head = createLinkedList(new int[]{1, 2, 3, 4, 5});
        int k = 2;

        RotateList rotateList = new RotateList();
        ListNode result = rotateList.rotateRight(head, k);

        assertArrayEquals(new int[]{4, 5, 1, 2, 3}, getLinkedListArray(result));
    }

    @Test
    public void testRotateRightExample2() {
        // Input: head = [0,1,2], k = 4
        // Output: [2,0,1]
        ListNode head = createLinkedList(new int[]{0, 1, 2});
        int k = 4;

        RotateList rotateList = new RotateList();
        ListNode result = rotateList.rotateRight(head, k);

        assertArrayEquals(new int[]{2, 0, 1}, getLinkedListArray(result));
    }

    // Helper method to create a linked list from an array of integers
    private ListNode createLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to convert a linked list to an array of integers
    private int[] getLinkedListArray(ListNode head) {
        ListNode current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }

        int[] result = new int[size];
        current = head;
        int i = 0;
        while (current != null) {
            result[i++] = current.val;
            current = current.next;
        }
        return result;
    }

}