package org.example;

import org.example.arrays.ContainsDuplicate;
import org.example.arrays.GroupAnagrams;
import org.example.arrays.TwoSum;
import org.example.arrays.ValidAnagram;
import org.example.linkedList.ReverseLinkedList;
import org.example.slidingWindow.SlidingWindow;
import org.example.stack.ValidParentheses;
import org.example.trees.invertBinaryTree;
import org.example.twoPointers.ValidPalindrome;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Contains Duplicate
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Contains Duplicate: " + ContainsDuplicate.hasDuplicate(nums));


        //Valid Anagram
        String s = "racecarcarracecarracecarracecarrace";
        String m = "carraceracecarracecarracecarracecar";
        System.out.println("Valid Anagram: " + ValidAnagram.isAnagram(s, m));
        //String test = "zxyfba";
        //char[] testChar = test.toCharArray();
        //int[] testInt = {4,3,2,5,1};
        //System.out.println(Arrays.toString(testInt));
        //System.out.println(Arrays.toString(testChar));
        //ValidAnagram.bubbleSort(testInt);
        //ValidAnagram.bubbleSort(testChar);
        //System.out.println(Arrays.toString(testInt));
        //System.out.println(Arrays.toString(testChar));


        //Two Sum
        int[] nums2 = {5, 5};
        System.out.println("Two Sum: " + Arrays.toString(TwoSum.twoSum(nums2, 10)));

        //Valid Palindrome
        System.out.println("Valid Palindrome: " + ValidPalindrome.isPalindrome("tac cat"));

        //Slide Window
        int[] prices = {10, 7, 5, 2};
        System.out.println("Max profit: " + SlidingWindow.maxProfit2(prices));

        //Valid Parentheses
        String str = "((])";
        System.out.println("Is Valid Parentheses: " + ValidParentheses.isValid(str));

        //Group Anagrams
        String[] strs = {"hat", "act", "pots", "tops", "cat", "stop"};
        System.out.println("Has Group of Anagrams: " + GroupAnagrams.hasGroupAnagrams(strs));


        //Reverse LinkedList
        ReverseLinkedList.ListNode fourth = new ReverseLinkedList.ListNode(4);
        ReverseLinkedList.ListNode third = new ReverseLinkedList.ListNode(3, fourth);
        ReverseLinkedList.ListNode second = new ReverseLinkedList.ListNode(2, third);
        ReverseLinkedList.ListNode head = new ReverseLinkedList.ListNode(1, second);

        System.out.println("Reverse LinkedList: " + ReverseLinkedList.reverseLinkedList(head));

        //Invert Binary Tree
        invertBinaryTree.TreeNode childrenLeft11 = new invertBinaryTree.TreeNode(4);
        invertBinaryTree.TreeNode childrenLeft12 = new invertBinaryTree.TreeNode(5);
        invertBinaryTree.TreeNode childrenLeft1 = new invertBinaryTree.TreeNode(2, childrenLeft11, childrenLeft12);
        invertBinaryTree.TreeNode childrenRight11 = new invertBinaryTree.TreeNode(6);
        invertBinaryTree.TreeNode childrenRight12 = new invertBinaryTree.TreeNode(7);
        invertBinaryTree.TreeNode childrenRight1 = new invertBinaryTree.TreeNode(3, childrenRight11, childrenRight12);
        invertBinaryTree.TreeNode root = new invertBinaryTree.TreeNode(1, childrenLeft1, childrenRight1);

        System.out.println("Binary Tree: " + root.toString());
        invertBinaryTree.TreeNode invertedTree = invertBinaryTree.invertTree(root);
        System.out.println("Invert Binary Tree: " + invertedTree);
    }
}