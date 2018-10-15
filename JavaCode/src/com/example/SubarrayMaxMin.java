package com.example;

import java.util.Arrays;

public class SubarrayMaxMin {
    // For a given vector of integers and integer K, find the number of non-empty subsets S
    // such that min(S) + max(S) <= K.
    // For example, for K = 8 and vector [2, 4, 5, 7], the solution is 5 and these are all
    // the subsets that satisfy the requirements: [2], [4], [2, 4], [2, 4, 5], [2, 5].
    public static int subarrayMaxMin(int[] vector, int k){
        Arrays.sort(vector);// O(nlogn) complexity
        int result = 0;
        for(int i = 0; i < vector.length; i++){
            if(vector[i] * 2 <= k) {
                result++;
            }
            for(int j = i + 1; j < vector.length; j++){
                if(vector[i] + vector[j] <= k){
                    result += Math.pow(2,(j-i) - 1);
                }
            }
        }


        return result;
    }
}
