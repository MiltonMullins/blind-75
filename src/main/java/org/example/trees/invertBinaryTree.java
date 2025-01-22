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
    public static TreeNodeImpl invertTree(TreeNodeImpl root) {
        if (root == null) { //recursion check when repeat.. isLeafNode?
            return null;
        }

        TreeNodeImpl tempTree = new TreeNodeImpl(root.val);

        tempTree.right = invertTree(root.left);
        tempTree.left = invertTree(root.right);

        return tempTree;
    }

}