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
            int sth = 0;
            if(n%2 == 0){
                sth = n/2;
            }else{
                sth = n/2 + 1;
            }
            for(int j = 0; j < sth; j += 1){
                temp.remove(j);
                System.out.println(temp);
            }

            if(temp.size() < 2){
                break;
            }
            for(int k = temp.size() - 1; k > sth; k -= 2){

                temp.remove(k);
                System.out.println(temp);
            }
            System.out.println("--------");

        }

        return (Integer) temp.get(0);

    }
}
