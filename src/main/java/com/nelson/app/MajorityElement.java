package com.nelson.app;

public class MajorityElement {

    public int majorityElement(int[] nums) {
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        int goal = nums.length / 2;
        
        Map<Integer, Integer> seen = new HashMap<>();
        
        for (int num: nums) {
            if (seen.containsKey(num)) {
                int inc = seen.get(num) + 1;
                seen.put(num, inc);
                if (inc > goal) return num;
            } else {
                seen.put(num, 1);
            }
        }
        return 0;
    }
    
}
