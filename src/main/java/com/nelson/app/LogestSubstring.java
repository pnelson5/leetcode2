package com.nelson.app;

import java.util.HashSet;
import java.util.Set;

public class LogestSubstring {
    
    public int lengthOfLongestSubstring(String s) {

           
        if (s.length() <= 1) {
            return s.length();
        }
        
        int window = 1;
        
        int left = 0;
        int right = 0;
        
        Set<Character> seen = new HashSet<>();
        
        for (int j = 0; j <s.length(); j++){
                    seen.add(s.charAt(j));

        for (int i = j+1; i < s.length(); i++) {
            // attempt to move right pointer
            if (seen.contains(s.charAt(i))) {
                // found repeat
                window = Math.max(window, right - left + 1);
                left++;
                right = left;
                seen = new HashSet<>();
                    break;
            } else {
                seen.add(s.charAt(i));
                right++;
            }
        }}
        
        window = Math.max(window, right - left + 1);
        
        return window;
    }
}
