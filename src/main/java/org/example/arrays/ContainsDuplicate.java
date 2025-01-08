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

public class ContainsDuplicate {

    public static boolean hasDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i< nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}
