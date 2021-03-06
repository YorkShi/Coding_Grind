package com.example;

/**
 * Created by Isaac on 1/6/17.
 * Median of Two Sorted Arrays
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5
 */
public class medianTwoArrays {
    /*public static void main(String [] args){
        int[] num1 = {1,2};
        int[] num2 = {3,4};
        System.out.println(findMedian(num1, num2));
    }*/

    public static float findMedian(int[] num1, int[] num2){
        float result = 0;
        int Length = num1.length + num2.length;
        int[] mergedArray = new int[Length];

        int i = 0, j = 0;
        boolean state = true;

        if(num1.length == 0){
            mergedArray = num2;
            state = false;
        }

        if(num2.length == 0){
            mergedArray = num1;
            state = false;
        }

        while(i < num1.length && j < num2.length && state){
            if(num1[i] <= num2[j]){
                mergedArray[i+j] = num1[i];
                i++;
            }else{
                mergedArray[i+j] = num2[j];
                j++;
            }

            //if one of this array runs out of itself
            if(i == num1.length){
                for(;j<num2.length;j++){
                    mergedArray[i+j] = num2[j];
                    //System.out.println(mergedArray[i+j]);
                }
            }else if(j == num2.length){
                for(;i<num1.length;i++){
                    mergedArray[i+j] = num1[i];
                    //System.out.println(mergedArray[i+j]);
                }
            }
        }

        //test merge list
        for(int k = 0; k < mergedArray.length; k++) {
            System.out.println(mergedArray[k]);
        }

        if(Length%2 == 0)
            result = (mergedArray[Length/2] + mergedArray[Length/2 -1])/2;
        else
            result = mergedArray[(Length-1)/2];

        return result;
    }
}
