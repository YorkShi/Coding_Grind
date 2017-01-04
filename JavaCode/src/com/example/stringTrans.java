package com.example;
import java.
/**
 * Created by Isaac on 1/4/17.
 * aaaa -> 4xa, abbbc -> a3xbc, 4444cb -> 4x4cb
 */
public class stringTrans {
    public static String encodeString(String str){
        String temp = "";
        int count = 0;
        String result = "";
        for (int i = 0; i < str.length(); i++){
            //temp = str.charAt(i);
            //border case
            if(str.length() < 2){
                return str;
            }
            if(str == null){
                return null;
            }

            //taverse the string
            if(!String.valueOf(str.charAt(i)).equals(temp)){
                if(count == 0){
                    result += temp;
                }else{
                    result += ++count + "x" + temp;
                }
                temp = String.valueOf(str.charAt(i));
                count = 0;
            }
            else{
                count++;
            }

            //last bit
            if(i == str.length() - 1){
                if(count == 0){
                    result = result + temp;
                }else{
                    result = result + ++count + "x" + temp;
                }
            }
        }
        return result;
    }

    public String decodeString(String str){
            return "nope";
    }

    public static void main(String [] args){
            System.out.println(encodeString("aabbccc"));
    }
}
