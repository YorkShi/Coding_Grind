package com.example;

public class removeDuplicates {


    public int removeDuplicates(int[] nums) {
        if(nums.equals(null) || nums.length < 1){
            return 0;
        }
        int prev = nums[0], prevCursor = 0, counter = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] != prev){
                prev = nums[i];
                counter++;
                prevCursor++;
                nums[prevCursor] = prev;
            }
        }
        return counter;
    }

}
