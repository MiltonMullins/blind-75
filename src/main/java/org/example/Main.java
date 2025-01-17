package org.example;

import org.example.arrays.ContainsDuplicate;
import org.example.arrays.TwoSum;
import org.example.arrays.ValidAnagram;
import org.example.arrays.CroupAnagrams;
import org.example.slidingWindow.SlidingWindow;
import org.example.stack.ValidParentheses;
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
        System.out.println("Has Group of Anagrams: " + CroupAnagrams.hasGroupAnagrams(strs));

    }
}