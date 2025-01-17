package org.example.arrays;

/*
Given an array of strings strs, group all anagrams together into sublists. You may return the output in any order.

An anagram is a string that contains the exact same characters as another string, but the order of the characters can be different.

Example 1:

Input: strs = ["act","pots","tops","cat","stop","hat"]

Output: [["hat"],["act", "cat"],["stop", "pots", "tops"]]
Example 2:

Input: strs = ["x"]

Output: [["x"]]
Example 3:

Input: strs = [""]

Output: [[""]]
Constraints:

1 <= strs.length <= 1000.
0 <= strs[i].length <= 100
strs[i] is made up of lowercase English letters.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CroupAnagrams {

    //Brute Force Solution made by Me
    //Time Complexity: O(n ^2)
    //Space Complexity: O(n)
    public static List<List<String>> hasGroupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        List<String> tempList = new ArrayList<>();

        for (String str : strs) {
            tempList.add(str);
            if (result.stream().noneMatch(results -> results.contains(str))) {

                char[] tempChar1 = tempList.get(0).toCharArray();
                Arrays.sort(tempChar1);

                for (String s : strs) {
                    if (!s.equals(str)) {
                        char[] tempChar2 = s.toCharArray();
                        Arrays.sort(tempChar2);

                        if (Arrays.equals(tempChar1, tempChar2)) {
                            tempList.add(s);
                        }
                    }
                }

                result.add(tempList);
            }
            tempList = new ArrayList<>();

        }
        return result;
    }
}
