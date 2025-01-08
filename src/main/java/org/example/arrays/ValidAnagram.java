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

public class ValidAnagram {

    public static boolean isAnagram(String s, String m){
        boolean resp=true;

        //Brute Force Solution

        //if the length are not equal cant be anagrams
        if(s.length()!=m.length()){
            return false;
        }
        //Sort
        char[] arrayS = s.toCharArray();
        char[] sortedArrayS = bubbleSort(arrayS);
        char[] arrayM = m.toCharArray();
        char[] sortedArrayM = bubbleSort(arrayM);

        //Compare each character
        for (int i=0; i<arrayS.length-1;i++){
            if(sortedArrayS[i]!= sortedArrayM[i]){
                resp = false;
            }
        }

        return resp;
    }

    public static char[] bubbleSort(char[] array){
        for(int i=0; i<array.length-1; i++){
            boolean isSwapped = false;
            for(int j=0; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    char temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                break;
            }
        }
        return array;
    }

    public static int[] bubbleSort(int[] array){
        for(int i=0; i<array.length-1; i++){
            boolean isSwapped = false;
            for(int j=0; j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    isSwapped = true;
                }
            }
            if(!isSwapped){
                 break;
            }
        }
        return array;
    }
}
