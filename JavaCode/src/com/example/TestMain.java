package com.example;

/**
 * Created by Isaac on 1/4/17.
 */
public class TestMain {
        public static void main(String[] args){

            //zig zag conversion test case
            String s = "PAYPALISHIRING";
            int nRows = 3;
            System.out.println(zigzag.convert(s,nRows));

            //reverse Integer
            final int TEST_INT = -123;
            System.out.println(ReverseInteger.reverse(TEST_INT));

        }

}