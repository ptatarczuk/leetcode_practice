package org.example.LinkedList;

import java.util.HashMap;

class NodeCopy {
    int val;
    NodeCopy next;
    NodeCopy random;

    public NodeCopy(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class CopyListWithRandomPointer {
    public NodeCopy copyRandomList(NodeCopy head) {
        if (head == null) return null;

        HashMap<NodeCopy, NodeCopy> oldToNew = new HashMap<>();

        NodeCopy curr = head;
        while (curr != null) {
            oldToNew.put(curr, new NodeCopy(curr.val));
            curr = curr.next;
        }

        curr = head;
        while (curr != null) {
            oldToNew.get(curr).next = oldToNew.get(curr.next);
            oldToNew.get(curr).random = oldToNew.get(curr.random);
            curr = curr.next;
        }

        return oldToNew.get(head);
    }
}
