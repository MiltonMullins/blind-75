package org.example.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

/*
Given the beginning of a singly linked list head, reverse the list, and return the new beginning of the list.

Example 1:

Input: head = [0,1,2,3]

Output: [3,2,1,0]
Example 2:

Input: head = []

Output: []
Constraints:

0 <= The length of the list <= 1000.
-1000 <= Node.val <= 1000

 */
public class ReverseLinkedList {

    //Brute Force Solution (Done in 40 mins)
    //Time complexity: O(n)
    //Space complexity: O(n)
    public static ArrayList reverseLinkedList(ListNode head) {
        if (head == null) {
            return null;
        }
        ArrayList returnArray = new ArrayList();
        ArrayList list2 = new ArrayList();

        while (head.hasNext()){
            list2.add(head.val);
            head = head.next;
        }
        returnArray.add(head.val);
        for (int i = list2.size()-1; i >= 0 ; i--) {
            returnArray.add(list2.get(i));
        }

        return returnArray;
    }

    //Recursion Solution
    //Time complexity: O(n)
    //Space complexity: O(n)
    public ListNode reverseListRecursion(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode newHead = head;
        if (head.next != null) {
            newHead = reverseListRecursion(head.next);
            head.next.next = head;
        }
        head.next = null;

        return newHead;
    }
    //Iteration Solution - Two Pointers
    //Time complexity: O(n)
    //Space complexity: O(1)
    public ListNode reverseListIteration(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        public ListNode(int val) {
            this.val = val;
        }

        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        boolean hasNext(){
            return this.next != null;
        }
    }
}
