package com.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Created by Isaac on 2/2/17.
 * Given an array S of n integers, are there elements a, b, c
 * in S such that a + b + c = 0?
 * Find all unique triplets in the array which gives the sum of zero.
 */
public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        //border case
        if(nums.length <= 2 || nums[0] + nums[1] >= 0)
            return result;
        int i, j, k;
        for(i = 0; i < nums.length - 2; i++){
            for(j = 1; j < nums.length - 1; j++){
                for(k = 2; k < nums.length ; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        int a = i, b = j, c = k;
                        //System.out.println(Arrays.toString(nums));
                        List<Integer> temp = new ArrayList<Integer>() {{
                            add(nums[a]);
                            add(nums[b]);
                            add(nums[c]);
                        }};
                        result.add(temp);
                    }
                }
            }
        }

        return result;
    }
}
