package com.example;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        if(s.equals(""))
            return true;
        for(String word : wordDict){
            int len = word.length();
            if(word.equals(s)){
                return true;
            }else if(word.length() < s.length() && word.equals(s.substring(0,len))){
                if(wordBreak(s.substring(len), wordDict)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean wordBreak2(String s, List<String> wordDict) {
        return wordBreakAux(s, wordDict, 0, new Boolean[s.length()]);
    }

    public static boolean wordBreakAux(String s, List<String> wordDict, int start, Boolean[] memo) {
        if (start == s.length()) {
            return true;
        }
        if (memo[start] != null) {
            return memo[start];
        }
        for (int end = start + 1; end <= s.length(); end++) {
            if (wordDict.contains(s.substring(start, end)) && wordBreakAux(s, wordDict, end, memo)) {
                return memo[start] = true;
            }
        }
        return memo[start] = false;
    }
}
