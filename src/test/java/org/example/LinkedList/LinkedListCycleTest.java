package org.example.LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
    @Test
    public void testHasCycleWithCycleInMiddle() {
        // Create a linked list with a cycle in the middle
        ListNode head = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(-4);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node1; // Cycle

        LinkedListCycle solution = new LinkedListCycle();
        assertTrue(solution.hasCycle(head));
    }

    @Test
    public void testHasCycleWithCycleAtBeginning() {
        // Create a linked list with a cycle at the beginning
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);

        head.next = node1;
        node1.next = head; // Cycle

        LinkedListCycle solution = new LinkedListCycle();
        assertTrue(solution.hasCycle(head));
    }

    @Test
    public void testHasCycleWithNoCycle() {
        // Create a linked list with no cycle
        ListNode head = new ListNode(1);

        LinkedListCycle solution = new LinkedListCycle();
        assertFalse(solution.hasCycle(head));
    }

}