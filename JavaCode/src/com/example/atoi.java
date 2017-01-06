package com.example;

/**
 * Created by Isaac on 1/7/17.
 */
public class atoi {
    public static void main(String[] args){

    }

    public static int atoi(String str){
        int result = 0;
        boolean sign = true;
        if(str.length() < 1 || str == null)
            return result;

        if(String.valueOf(str.charAt(0)) == "-")
            sign = false;






        //sign handling
        if(!sign)
            result *= -1;

        return result;
    }
}
