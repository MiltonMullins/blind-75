package org.example.trees;

/*
You are given the root of a binary tree root. Invert the binary tree and return its root.
Input: root = [1,2,3,4,5,6,7]

Output: [1,3,2,7,6,5,4]
 */

public class invertBinaryTree {

    //My Solution: Recursion - This solution is called Depth First Search
    //Time Complexity: O(n) - n is the number of nodes in the tree
    //Space Complexity: O(n) - n is the number of nodes in the tree
    public static TreeNode invertTree(TreeNode root) {
        if (root == null) { //recursion check when repeat.. isLeafNode?
            return null;
        }

        TreeNode tempTree = new TreeNode(root.val);

        tempTree.right = invertTree(root.left);
        tempTree.left = invertTree(root.right);

        return tempTree;
    }

    //Definition for a binary tree node.
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        public TreeNode(int val) {
            this.val = val;
        }

        public TreeNode(int val, TreeNode left, TreeNode right) {
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
}