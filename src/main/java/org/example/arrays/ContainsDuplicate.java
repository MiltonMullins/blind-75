package org.example.arrays;

/*
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false

 */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    //Sorting Solution
    //Time Complexity: O(nlogn)
    //Space Complexity: O(1)
    public static boolean hasDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    //Hash Set Solution
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static boolean hasDuplicate2(int[] nums){
        Set<Integer> set = new HashSet<>();
        for(int i=0;i< nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    //Brute Force Solution
    //Time Complexity: O(n^2)
    //Space Complexity: O(1)
    public static boolean hasDuplicate3(int[] nums){
        for(int i=0;i< nums.length;i++){
            for(int j=i+1;j< nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }

    //Hash Set Length Solution
    //Time Complexity: O(n)
    //Space Complexity: O(n)
    public static boolean hasDuplicate4(int[] nums){
       return Arrays.stream(nums).distinct().count() != nums.length;
    }
}
