package org.example.trees;

public class isSubTree {
    //Time Complexity: O(n*m) - n is the number of nodes in the tree and m is the number of nodes in the subTree
    //Space Complexity: O(n) - n is the number of nodes in the tree
    public static boolean isSubtree(TreeNodeImpl root, TreeNodeImpl subRoot) {
        if (root == null) {
            return false;
        }
        if (isSameTree(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static boolean isSameTree(TreeNodeImpl p, TreeNodeImpl q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val
                && isSameTree(p.left, q.left)
                && isSameTree(p.right, q.right);
    }
}
