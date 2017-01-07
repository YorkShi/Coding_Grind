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
        if(str.length() < 1 || str.equals(null))
            return result;

        if(String.valueOf(str.charAt(0)).equals("-"))
            sign = false;

        //trim the string
        str = str.trim();

        //calculate the value
        int i = 1;
        while(str.length() > i && str.charAt(i) >= 1 && str.charAt(i) <= 9){
            result = result*10 + str.charAt(i) - '0';
            i++;
        }

        //integer max
        if(result >= Integer.MAX_VALUE){
            return  Integer.MAX_VALUE;
        }

        //integer min
        if(result <= Integer.MIN_VALUE){
            return  Integer.MIN_VALUE;
        }


        //sign handling
        if(!sign)
            result *= -1;

        return result;
    }
}
