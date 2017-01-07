package com.example;

/**
 * Created by Isaac on 1/6/17.
 * Median of Two Sorted Arrays
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
public class medianTwoArrays {
    public static void main(String [] args){
        float[] num1 = {1,2};
        float[] num2 = {3,4};
        System.out.println(findMedian(num1, num2));
    }

    public static float findMedian(float[] num1, float[] num2){
        float result = 0;
        int temp = num1.length + num2.length;
        float temp1, temp2;
        boolean state = true, state1 = true;
        if(temp % 2 == 0){
            temp1 = temp/2;
            temp2 = temp1 + 1;
            state = false;
        } else{
            temp1 = (temp+1)/2;
        }
        int i = 0, j = 0, count = 0;
        while(i < num1.length && j < num2.length){

            if(state){
                if(count == temp1){
                    if(state1){result = num1[i];}else{result = num2[j];
                        break;
                    }}}else{
                if(count == temp1){
                    float temp3;
                    if(state1){
                        temp3 = num1[i-1];
                    }else{
                        temp3 = num2[j-1];
                    }
                    if(num1[i] <= num2[j]){
                        result = (temp3+num1[i])/2;
                    }else{
                        result = (temp3+num2[j])/2;
                    }
                    break;
                }
            }
            
            if(num1[i] <= num2[j]){
                count++;
                i++;
            }else{
                count++;
                j++;
                state1 = false;
            }


        }



        return result;
    }
}
