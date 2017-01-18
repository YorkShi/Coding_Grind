package com.example;

import java.net.Inet4Address;
import java.util.ArrayList;

/**
 * Created by Isaac on 1/18/17.
 */
public class Elimination {
    public static int lastRemain(int n){

        if(n==0)
            return 0;

        if(n == 1)
            return 1;

        ArrayList temp = new ArrayList();

        for(int i = 1; i < n + 1; i++){
            temp.add(i);
        }

        //System.out.println(temp);

        while(temp.size() > 1){
            for(int j = 0; j < temp.size(); j += 1){
                temp.remove(j);
                System.out.println(temp);
            }
            System.out.println("--------");
            for(int k = temp.size() - 1; k > 2; k -= 1){
                System.out.println(temp);
                temp.remove(k);
                System.out.println(temp);
            }
        }

        return (Integer) temp.get(0);

    }
}
