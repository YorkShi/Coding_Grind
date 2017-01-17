package com.example;

/**
 * Created by Isaac on 1/18/17.
 * Given an integer, convert it to a roman numeral.
 * Input is guaranteed to be within the range from 1 to 3999.
 */
public class Integer2Roman {

    public static String intToRoman(int num){
        if(num >= 1000){
            return "M" + intToRoman(num - 1000);
        }
        if(num >= 500){
            return "D" + intToRoman(num - 500);
        }
        if(num >= 100){
            return "C" + intToRoman(num - 100);
        }
        if(num >= 50){
            return "L" + intToRoman(num - 50);
        }
        if(num >= 10){
            return "X"+ intToRoman(num - 10);
        }
        if(num >= 5){
            return "V" + intToRoman(num - 5);
        }
        if(num >= 1){
            return intToRoman(num - 1) + "I";
        }

        return "";
    }
}
