package org.example.arrays;

/*
Given two strings s and t, return true if the two strings are anagrams of each other, otherwise return false.

An anagram is a string that contains the exact same characters as another string,
 but the order of the characters can be different.

 Example 1:

Input: s = "racecar", t = "carrace"

Output: true
Example 2:

Input: s = "jar", t = "jam"

Output: false

 Recommended Time & Space Complexity
You should aim for a solution with O(n + m) time and O(1) space,
 where n is the length of the string s and m is the length of the string t.

 Hint 1
A brute force solution would be to sort the given strings and check for their equality.
 This would be an O(nlogn + mlogm) solution. Though this solution is acceptable,
  can you think of a better way without sorting the given strings?

  Hint 2
By the definition of the anagram, we can rearrange the characters.
 Does the order of characters matter in both the strings? Then what matters?

 Hint 3
We can just consider maintaining the frequency of each character.
 We can do this by having two separate hash tables for the two strings.
 Then, we can check whether the frequency of each character in string s is equal to that in string t and vice versa.
*/

import java.util.Arrays;
import java.util.HashMap;

public class validAnagram {

    //Sorting Solution
    //Time Complexity: O(n log n+ m log m)
    //Space Complexity: O(1) or O(n + m) depending on the sorting algorithm.
    //Where n is the length of the string s and m is the length of the string t.
    public static boolean isAnagram(String s, String t) {
        boolean resp = true;

        //if the length are not equal cant be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        //Sort
        char[] arrayS = s.toCharArray();
        char[] sortedArrayS = bubbleSort(arrayS);
        char[] arrayM = t.toCharArray();
        char[] sortedArrayM = bubbleSort(arrayM);

        //Compare each character
        for (int i = 0; i < arrayS.length - 1; i++) {
            if (sortedArrayS[i] != sortedArrayM[i]) {
                resp = false;
            }
        }

        return resp;
    }

    //Using Bubble Sort to practice the algorithm
    public static char[] bubbleSort(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    char temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped) {
                break;
            }
        }
        return array;
    }

    //Sorting Solution using Arrays.sort
    public static boolean isAnagram2(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] sSort = s.toCharArray();
        char[] tSort = t.toCharArray();
        Arrays.sort(sSort);
        Arrays.sort(tSort);
        return Arrays.equals(sSort, tSort);
    }

    //Hash Table Solution
    //Time Complexity: O(n + m)
    //Space Complexity: O(1)
    public static boolean isAnagramHashTable(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> sMap = new HashMap<>();
        HashMap<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        return sMap.equals(tMap);
    }

    //Hash Table Optimal Solution
    //Time Complexity: O(n + m)
    //Space Complexity: O(1)  since we have at most 26 different characters
    public static boolean isAnagramOptimized(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int val : count) {
            if (val != 0) {
                return false;
            }
        }
        return true;
    }
}
