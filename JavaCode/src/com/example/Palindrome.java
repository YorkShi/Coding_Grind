package com.example;

public class Palindrome {
    public static boolean isPalindrome(String s){
        if(s.equals("") || s.length() <= 1){
            return true;
        }
        s = s.toLowerCase();
        int len = s.length();
        if(s.charAt(0) == s.charAt(len - 1))
            return isPalindrome(s.substring(1,len));
        return false;
    }

    public static boolean isTransformed(String s, int t){
        if(isPalindrome(s))
            return true;
        if(t == 0)
            return isPalindrome(s);
        int len = s.length();
        int cost = 0;
        for(int i  = 0, j = len - 1; i < j; i++, j--){
            if(s.charAt(i) != s.charAt(j))
                cost++;
        }
        return cost <= t;
    }

    public static String makePalindrome(String s, int[] start, int[] end, int[] times){
        StringBuilder result = new StringBuilder();
        int len = start.length;
        for(int i = 0; i < len; i++){
            if(isTransformed(s.substring(start[i], end[i] + 1), times[i])){
                result.append(1);
            }else{
                result.append(0);
            }
        }
        return result.toString();
    }
}
