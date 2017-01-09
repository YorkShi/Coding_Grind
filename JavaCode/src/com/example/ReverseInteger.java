package com.example;

/**
 * Created by Isaac on 1/9/17.
 * Example1: x = 123, return 321
 * Example2: x = -123, return -321
 */
public class ReverseInteger {
    public static int reverse(int x){
        int result = 0;
        int sign = 1;
        if(x < 0){
            sign = -1;
            x *= -1;
        }

        while(x > 0){
            int temp = x%10;
            result = result*10 + temp;
            x = x/10;
        }

        result *= sign;
        return result;
    }
}
