package com.example;

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
            int sth = (temp.size() + 1) / 2;

            for(int j = 0; j < sth; j += 1){
                temp.remove(j);
                //System.out.println(temp);
            }
            //System.out.println("--------");
            if(temp.size() < 2){
                break;
            }

            for(int k = temp.size(); 0 < k; k -= 2){
                //
                temp.remove(k - 1);
                //System.out.println(temp);
            }
            //System.out.println("--------");

        }

        return (Integer) temp.get(0);

    }
}
