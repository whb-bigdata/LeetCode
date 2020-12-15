package com.aibee.leetcode.DP01;

import jdk.nashorn.internal.ir.CallNode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class numsum02 {
    public static int[] arrs = new int[]{2, 7, 5, 15};

    public static void main(String[] args) {
        Solution2 solution = new Solution2();
        int[] twosum = solution.twosum(arrs, 10);
        if (twosum == null) {
            System.out.printf("没有");
        } else {
            for (int i : twosum) {
                System.out.print(i + " ");
            }
        }


    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length - 1; i++) {

            for (int j = i + 1; j < nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}

class Solution2 {
    public int[] twosum(int[] nums, int target) {
        HashMap<Integer, Integer> result = new HashMap<Integer, Integer>();
        int complement;
        for (int i = 0; i < nums.length; i++) {
            complement = target - nums[i];
            if (result.get(nums[i]) == null) {
                result.put(complement, i);
            } else {
                return new int[]{i, result.get(nums[i])};
            }
        }
        return null;
    }

}
