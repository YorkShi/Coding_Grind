package com.example;

/**
 * Created by Isaac on 1/22/17.
 */
public class BinarySort {
    public static int[] binarySort(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        int temp = -1;
        while(left < right){
            if(nums[left] > nums[right]){
                temp = nums[right];
                nums[right] = nums[left];
                nums[left] = temp;
                left++;
                right--;
            }else if(nums[left] == nums[right]){
                if(nums[left] == 1){
                    right--;
                }else{
                    left++;
                }
            }else{
                right--;
                left++;
            }

        }
        return nums;

    }
}
