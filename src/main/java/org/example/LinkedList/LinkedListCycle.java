package org.example.LinkedList;

import java.util.HashSet;

/*class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}*/

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> visited_nodes = new HashSet<>();
        ListNode current_node = head;
        while (current_node != null) {
            if (visited_nodes.contains(current_node)) {
                return true;
            }
            visited_nodes.add(current_node);
            current_node = current_node.next;
        }
        return false;
    }
}
