package com.example;

/**
 * Created by Isaac on 1/8/17.
 * convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 *                                             PAHNALIGYPISRI
 */
public class zigzag {
    public static String convert(String s, int numRows) {
        String[] result = new String[numRows];
        int tuple = numRows*2 - 2;
        for(int i = 0; i < s.length(); i++) {
            int temp = i % tuple + 1;
            if (temp < numRows){
                result[temp - 1] += s.charAt(i);
            }else{
                result[temp - tuple + numRows - 1] += s.charAt(i);
            }
        }
        String output = "";
        for(int j = 0; j < result.length; j++) {
            System.out.println(result[j]);
            output += result[j];
        }
        return output;
    }
}
