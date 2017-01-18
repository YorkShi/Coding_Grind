package com.example;

/**
 * Created by Isaac on 1/18/17.
 */
public class LongestCommonPrefix {
    public static String lookup(String[] strs){
        //base case
        if(strs.length == 0){
            return "";
        }
        int i = 0, j = 0;
        String temp = strs[0];
        while(i < strs.length){
            while(strs[i].indexOf(temp) != 0){
                temp = temp.substring(0,temp.length() - 1);
            }
            i++;
        }
        return temp;c
    }
}
