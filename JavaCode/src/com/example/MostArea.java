package com.example;
import java.util.*;
/**
 * Created by Isaac on 1/13/17.
 */
public class MostArea {
    public static int maxArea(int[] height) {
        List<Integer> myList = new ArrayList<Integer>();

        for(int i = 0; i < height.length; i++){
            for(int j = 0; j < height.length; j++){
                if(i != j) {
                    if(height[i] == 0 || height[j] == 0){
                        myList.add(0);
                        continue;
                    }
                    int temp = Math.abs(i - j) * (height[i] + height[j]) / 2;
                    myList.add(temp);
                }
            }
        }

        return Collections.max(myList);
    }
}
