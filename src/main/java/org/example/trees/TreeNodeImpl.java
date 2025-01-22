package org.example.trees;


//Definition for a binary tree node.
public class TreeNodeImpl {
    int val;
    TreeNodeImpl left;
    TreeNodeImpl right;

    TreeNodeImpl() {
    }

    public TreeNodeImpl(int val) {
        this.val = val;
    }

    public TreeNodeImpl(int val, TreeNodeImpl left, TreeNodeImpl right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        if (this.right == null && this.left == null)
            return "" + this.val;
        return this.val + this.left.toString() + this.right.toString();
    }
}
