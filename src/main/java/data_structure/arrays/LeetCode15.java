package data_structure.arrays;

import java.util.*;

/**
 * 15. 3Sum
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 */

public class LeetCode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return null;
        }

        Arrays.sort(nums); // 排序后能排除很多情况，直接退出循环

        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i <= nums.length-3; i++) {
            int midTarget = -1 * nums[i];
            Set<Integer> seen = new HashSet<Integer>();
            for (int j = i+1; j < nums.length; j++) {


            }
        }
        return results;
    }
}
