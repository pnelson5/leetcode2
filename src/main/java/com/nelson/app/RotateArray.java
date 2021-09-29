package com.nelson.app;

public class RotateArray {
    
    public void rotate(int[] nums, int k) {

        // 1,2,3,4,5,6,7  k = 3
        // i=3, i=4, i=5, i=6, i=0, i=1, i=2

        // i = (j + k) % nums.length;

        int[] result = new int[nums.length];

        int i = Integer.MIN_VALUE;
        for (int j = 0; j < nums.length; j++) {
            i = (j + k) % nums.length;
            result[i] = nums[j];
        }

        nums = result;

    }
}
