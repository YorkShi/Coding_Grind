package com.example;

/**
 * Created by Isaac on 1/4/17.
 */
public class TestMain {
        public static void main(String[] args){

            //zig zag conversion test case
            String s = "PAYPALISHIRING";
            int nRows = 3;
            //System.out.println(zigzag.convert(s,nRows));

            //reverse Integer
            final int TEST_INT = 1534236469;
            //System.out.println(ReverseInteger.reverse(TEST_INT));

            //Regular Expression Match
            String TEST_STRING_1 = "aa";
            String TEST_STRING_2 = "a*";
            System.out.println(RegulaExpressionMatching.isMatch(TEST_STRING_1, TEST_STRING_2));
        }

}
