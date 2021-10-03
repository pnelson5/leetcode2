package com.nelson.app;

import java.util.HashSet;
import java.util.Set;

public class LogestSubstring {
    
    public int lengthOfLongestSubstring(String s) {

        int longest = 0;
        for (int i = 0; i < s.length(); i++) {

            int maybeLongest = 1;

            Set<Character> seen = new HashSet<>();

            seen.add(s.charAt(i));
            

            for (int j = i + 1; j < s.length(); j++) {
                
                if (!seen.contains(s.charAt(j))) {
                    seen.add(s.charAt(j));
                    maybeLongest++;
                } else {
                    break;
                }

            }

            longest = Math.max(longest, maybeLongest);
        }
        

        return longest;
    }
}
