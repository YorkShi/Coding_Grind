package com.example;

/**
 * Created by Isaac on 1/4/17.
 */
public class uniqueAbbr {
    public static void main(String [] args){
        String[] dict = {"deer", "door", "cake", "card"};
        System.out.println(toAbbr(dict[1]));
        System.out.println(ifUnique(dict, "dear"));
    }
    public static String toAbbr(String str){
        if(str.length() <= 2){
            return str;
        }
        if(str == null){
            return null;
        }
        int index = str.length() -2;
        String a = String.valueOf(str.charAt(0)) + index + String.valueOf(str.charAt(str.length() - 1));

        return a;
    }
    public static boolean ifUnique(String[] dict, String lookup){
        for(int i = 0; i < dict.length; i++){
            System.out.println(toAbbr(dict[i]));
            //System.out.println(toAbbr(lookup));
            if(toAbbr(dict[i]).equals(toAbbr(lookup))) {
                //System.out.println(toAbbr(dict[i]));
                //System.out.println(toAbbr(lookup));
                return false;
            }
        }
        return true;
    }
}
