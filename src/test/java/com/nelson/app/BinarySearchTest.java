package com.nelson.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchTest {
    
    @Test
    public void test() {
        BinarySearch bs = new BinarySearch();
        int[] nums = new int[]{1,2,3};
        int out = bs.search(nums, 9);
        assertEquals(-1, out);

        out = bs.search(nums, 2);
        assertEquals(1, out);

        int[] nums2 = new int[]{-1,0,3,5,9,12};
        out = bs.search(nums2, 9);
        assertEquals(4, out);
    }

}
