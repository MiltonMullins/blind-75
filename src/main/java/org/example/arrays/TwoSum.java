package org.example.arrays;

/*
Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:

Input:
nums = [3,4,5,6], target = 7

Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:

Input: nums = [4,5,6], target = 10

Output: [0,2]
Example 3:

Input: nums = [5,5], target = 10

Output: [0,1]
Constraints:

2 <= nums.length <= 1000
-10,000,000 <= nums[i] <= 10,000,000
-10,000,000 <= target <= 10,000,000
 */

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //My Solution - Brute Force
    //Time complexity: O(n^2)
    //Space complexity: O(1)
    public static int[] twoSum(int[] nums,int target){
        int[] indexes = {-1,-1};

        for(int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if (nums[i]+nums[j] == target){
                    if(nums[i]<=nums[j]){
                        indexes[0]=i;
                        indexes[1]=j;
                    }else{
                        indexes[0]=j;
                        indexes[1]=i;
                    }
                    return indexes;
                }
            }
        }
        return indexes;
    }

    //Hash Map Solution (Two-pass)
    //Time complexity: O(n)
    //Space complexity: O(n)
    public int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> indices = new HashMap<>();  // val -> index

        for (int i = 0; i < nums.length; i++) {
            indices.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indices.containsKey(diff) && indices.get(diff) != i) {
                return new int[]{i, indices.get(diff)};
            }
        }

        return new int[0];
    }

    //Hash Map Solution (One-pass)
    //Time complexity: O(n)
    //Space complexity: O(n)
    public int[] twoSum3(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }



}
