package com.example;

import java.util.*;


/**
 * Created by Isaac on 1/23/17.
 */
public class MergeSort {
    public static List<Integer> mergeSort(List<Integer> nums){
        int len = nums.size() - 1;
        if(len < 2){
            return nums;
        }
        List<Integer> pre = nums.subList(0,len/2);
        List<Integer> post = nums.subList((len + 1)/2, len);

        List<Integer> pre1 = mergeSort(pre);
        List<Integer> post1 = mergeSort(post);

        return merge(pre1, post1);
    }

    public static List<Integer> merge(List<Integer> nums1, List<Integer> nums2){
        List<Integer> result = new ArrayList<>();

        while(!nums1.isEmpty() && !nums2.isEmpty()){
            if(nums1.get(0) > nums2.get(0)){
                result.add(nums1.get(0));
                nums1.remove(0);
            }
            else if(nums1.get(0) < nums2.get(0)){
                result.add(nums2.get(0));
                nums2.remove(0);
            }
        }

        while(!nums1.isEmpty()){
            result.add(nums1.get(0));
            nums1.remove(0);
        }

        while(!nums2.isEmpty()){
            result.add(nums2.get(0));
            nums2.remove(0);
        }

        return result;
    }
}
