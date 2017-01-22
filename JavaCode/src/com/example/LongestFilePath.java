package com.example;

import java.util.Stack;

/**
 * Created by Isaac on 1/22/17.
 * https://leetcode.com/problems/longest-absolute-file-path/
 * instruction is too long to copy & paste
 * let's have some fun shit to do
 */
public class LongestFilePath {
    public static int longestLengthPath(String str){
        Stack<Integer> container = new Stack<>();
        String[] str1 = str.split("\n");
        int result = 0;
        int currentLong = 0;
        //TestMain.log(str1[0]);
        for(String s:str1){
            int length = s.length() - s.replaceAll("\t","").length();

            while(container.size() > length){
                currentLong -= container.pop();
            }

            int len = s.replaceAll("\t", "").length() + 1;
            currentLong += len;

            if(s.contains(".")){
                result = currentLong - 1 > result ? currentLong - 1 : result;
            }
            container.push(len);
        }

        return result;
    }
}
