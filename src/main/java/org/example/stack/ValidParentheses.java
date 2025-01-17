package org.example.stack;

/*
You are given a string s consisting of the following characters: '(', ')', '{', '}', '[' and ']'.

The input string s is valid if and only if:

Every open bracket is closed by the same type of close bracket.
Open brackets are closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
Return true if s is a valid string, and false otherwise.

Example 1:

Input: s = "[]"

Output: true
Example 2:

Input: s = "([{}])"

Output: true
Example 3:

Input: s = "[(])"

Output: false
Explanation: The brackets are not closed in the correct order.

Constraints:

1 <= s.length <= 1000

 */

import java.util.Stack;

public class ValidParentheses {

    //Two Pointers Solution
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        //boolean resp = true;
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            switch (s.charAt(left)) {
                case '(':
                    if (s.charAt(right) == ')') {
                        left++;
                        right--;
                    } else {
                        return false;
                    }
                    break;
                case '{':
                    if (s.charAt(right) == '}') {
                        left++;
                        right--;
                    } else {
                        return false;
                    }
                    break;
                case '[':
                    if (s.charAt(right) == ']') {
                        left++;
                        right--;
                    } else {
                        return false;
                    }
                    break;
            }
        }

        return true;
    }

    //Solution using Stack!
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public boolean isValidStack(String s) {
        Stack<Character> stack = new Stack<>();
        java.util.Map<Character, Character> closeToOpen = new java.util.HashMap<>();
        closeToOpen.put(')', '(');
        closeToOpen.put(']', '[');
        closeToOpen.put('}', '{');

        for (char c : s.toCharArray()) {
            if (closeToOpen.containsKey(c)) {
                if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
                    stack.pop();
                } else {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

    //Solution using Brute Force
    //Time complexity: O(n^2)
    //Space Complexity: O(n)
    public boolean isValidBruteForce(String s) {
        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
            s = s.replace("()", "");
            s = s.replace("{}", "");
            s = s.replace("[]", "");
        }
        return s.isEmpty();
    }

}
