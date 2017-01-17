package com.example;
import java.util.TreeMap;
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
        if(num >= 900){
            return "CM" + intToRoman(num - 900);
        }
        if(num >= 500){
            return "D" + intToRoman(num - 500);
        }
        if(num >= 400){
            return "CD" + intToRoman(num - 400);
        }
        if(num >= 100){
            return "C" + intToRoman(num - 100);
        }
        if(num >= 90){
            return "XC" + intToRoman(num - 90);
        }
        if(num >= 50){
            return "L" + intToRoman(num - 50);
        }
        if(num >= 40){
            return "XL" + intToRoman(num - 40);
        }
        if(num >= 10){
            return "X"+ intToRoman(num - 10);
        }
        if(num >= 9){
            return "IX"+ intToRoman(num - 9);
        }
        if(num >= 5){
            return "V" + intToRoman(num - 5);
        }
        if(num >= 4){
            return "IV" + intToRoman(num - 4);
        }
        if(num >= 1){
            return intToRoman(num - 1) + "I";
        }

        return "";
    }
    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();

    static {

        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");

    }
    public static String int2Roman(int num){
        int l =  map.floorKey(num);
        if ( num == l ) {
            return map.get(num);
        }
        return map.get(l) + int2Roman(num-l);
    }
}
