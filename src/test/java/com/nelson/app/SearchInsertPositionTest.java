package com.nelson.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SearchInsertPositionTest {
    
    @Test
    public void test() {
        SearchInsertPosition app = new SearchInsertPosition();
        int out = app.searchInsert(new int[]{1,2,3,5,6}, 4);
        assertEquals(3, out);
    }

}
