package org.example.trees;

public class sameTree {
    //Time Complexity: O(n) - n is the number of nodes in the tree
    //Space Complexity: O(n) - n is the number of nodes in the tree
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
