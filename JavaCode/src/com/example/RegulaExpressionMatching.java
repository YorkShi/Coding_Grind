package com.example;

/**
 * Created by Isaac on 1/9/17.
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 */
public class RegulaExpressionMatching {
    public static boolean isMatch(String s, String p){
        boolean result = true;

        //base case
        if(s.length() == 0)
            return p.length() == 0;

        //main
        if(p.length() == 1){
            //something to be done by tmr
        }


        return result;
    }
}
