package com.example;

import java.util.Arrays;

/**
 * Created by Isaac on 2/3/17.
 */
public class TwoSum {
    public static int[] TwoSum(int[] nums, int target){
        int[] result = new int[2];
        int lo = 0, hi = nums.length - 1;
        Arrays.sort(nums);
        while(lo < hi){
            int temp = nums[lo] + nums[hi];
            if(nums[lo] + nums[hi] == target){
                return new int[]{lo,hi};
            }
            if(temp > target)
                hi--;
            else
                lo++;

        }
        return null;
    }
}
