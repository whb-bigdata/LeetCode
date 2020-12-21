package com.aibee.leetcode.DP01;

public class Container {
    public static void main(String[] args) {
        System.out.println(maxArea1(new int[]{1,8,6,2,5,4,8,3,7}));
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
    public static  int maxArea1(int[] height){
        int left = 0;
        int right = height.length -1;
        int re ;
        int max = 0;
        while (left < right){
            re = Math.min( height[left],height[right]) * (right - left);
            if(height[left] > height[right]){
                right --;
            }else {
                left ++;
            }
            max = Math.max(re,max);
        }
        return max;
    }
}
