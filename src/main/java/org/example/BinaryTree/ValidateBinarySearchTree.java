package org.example.BinaryTree;

public class ValidateBinarySearchTree {
    private long minVal = Long.MIN_VALUE;
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (!isValidBST(root.left)) return false;

        if (minVal >= root.val) return false;

        minVal = root.val;

        return isValidBST(root.right);
    }
}
