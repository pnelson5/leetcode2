package com.nelson.app;

public class ReverseWords {
    
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word: words) {
            int length = word.length();
            while(length > 0) {
                sb.append(word.charAt(length -1));
                length--;
            }
            sb.append(" ");
        }
        sb.deleteCharAt(sb.length());

        return sb.toString();
    }
}
