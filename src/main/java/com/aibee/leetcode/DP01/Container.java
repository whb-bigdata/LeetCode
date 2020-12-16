package com.aibee.leetcode.DP01;

public class Container {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,2,1}));
    }

    public static int maxArea(int[] height) {
        int sum = 0;
        int[] arr = new int[2];
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                //sum = Math.min(height[i], height[j]) * (j - i);
                if (Math.min(height[i], height[j]) * (j - i) > sum) {
                    sum = Math.min(height[i], height[j]) * (j - i);
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return sum;
    }
}
