package com.example;

/**
 * Created by Isaac on 1/22/17.
 * BinarySearch(A, n, key)
 *  𝑙←1; ℎ←𝑛
 *  while (𝑙 ≤ ℎ)
        𝑚←(𝑙+ℎ) / 2ł
        if (𝐴[𝑚] >𝑘𝑒𝑦)
            ℎ←𝑚 – 1
        else if (𝐴[𝑚] < 𝑘𝑒𝑦)
            𝑙←𝑚 + 1
        else return 𝑚
    return −1

 */
public class BinarySearch {
    public static int binarySearch(int[] A, int n, int key){
        int low = 0;
        int high = n;
        while(low <= high){
            int m = (low + high)/2;
            if(A[m] > key){
                high = m - 1;
            }else if(A[m] < key){
                low = m + 1;
            }else{
                return m;
            }
        }
        return -1;
    }
}
