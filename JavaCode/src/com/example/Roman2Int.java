package com.example;
import java.util.*;
/**
 * Created by Isaac on 1/18/17.
 */
public class Roman2Int {

    private static HashMap dataSet = new HashMap();
    static {
        dataSet.put("I", 1);
        dataSet.put("IV", 4);
        dataSet.put("V", 5);
        dataSet.put("IX", 9);
        dataSet.put("X", 10);
        dataSet.put("XL", 40);
        dataSet.put("L", 50);
        dataSet.put("XC", 90);
        dataSet.put("C", 100);
        dataSet.put("XD", 400);
        dataSet.put("D", 500);
        dataSet.put("CM", 900);
        dataSet.put("M", 1000);
    }

    public static int convert(String str){

        if(str.length() == 1 && dataSet.get(str.charAt(0)) != null){
            return (Integer) dataSet.get(str.charAt(0)) ;//+ convert(str.substring(1));
        }

        if(str.length() >= 2){
            if(dataSet.get(str.substring(0,1)) == null){
                return (Integer) dataSet.get(str.charAt(0)) + convert(str.substring(1));
            }
            else{
                return (Integer) dataSet.get(str.substring(0,1)) + convert(str.substring(2));

            }
        }

        return 0;
    }
}
