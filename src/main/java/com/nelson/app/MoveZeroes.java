package com.nelson.app;

public class MoveZeroes {
    
    public void moveZeroes(int[] nums) {
        int notZero = 0;
        
        for (int num: nums) {
            if (num != 0) {
                nums[notZero++] = num;
            }
        }
        
        while (notZero < nums.length) {
            nums[notZero++] = 0;
        }


    }
}
