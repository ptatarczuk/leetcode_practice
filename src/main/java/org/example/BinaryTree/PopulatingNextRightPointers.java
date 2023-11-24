package org.example.BinaryTree;

public class PopulatingNextRightPointers {
    public Node connect(Node root) {
        Node dummyHead  = new Node(0);
        Node pre = dummyHead;
        Node real_root = root;

        while(root != null){
            if(root.left != null){
                pre.next = root.left;
                pre = pre.next;
            }
            if(root.right != null){
                pre.next = root.right;
                pre = pre.next;
            }
            root = root.next;
            if(root == null){
                pre = dummyHead;
                root = dummyHead.next; ;
                dummyHead.next = null;
            }
        }
        return real_root;
    }
}
