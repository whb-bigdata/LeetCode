package com.aibee.leetcode.DP01;

import java.util.List;

/**
 * 题目描述：抢劫一排住户，但是不能抢邻近的住户，求最大抢劫量。
 * <p>
 * 定义 dp 数组用来存储最大的抢劫量，其中 dp[i] 表示抢到第 i 个住户时的最大抢劫量。
 * <p>
 * 由于不能抢劫邻近住户，如果抢劫了第 i -1 个住户，那么就不能再抢劫第 i 个住户，所以
 */
public class Robber01 {
    public static int[] arr = new int[]{10005, 20, 2, 12, 1000,10017};

    public static void main(String[] args) {
        System.out.println(rob(arr));
    }


    //todo 练习1
    public static int robfirst(int[] nums) {
        int pre2 = 0, pre1 = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.max(pre2 + nums[i], pre1);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }
    //todo 练习2
    public static  int robsecond(int[] nums){
        int pre1 = 0,pre2 = 0;
        for (int i = 0; i < nums.length; i++) {
            int cur = Math.max(pre1 + nums[i] , pre2);
            pre1 = pre2;
            pre2 = cur;
        }
        return pre2;
    }
    //todo 变种：头尾相接，形成环状
    public static  int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }
        return Math.max(robr(nums, 0, n - 2), robr(nums, 1, n - 1));
    }

    private static int robr(int[] nums, int first, int last) {
        int pre2 = 0, pre1 = 0;
        for (int i = first; i <= last; i++) {
            int cur = Math.max(pre1, pre2 + nums[i]);
            pre2 = pre1;
            pre1 = cur;
        }
        return pre1;
    }

}
