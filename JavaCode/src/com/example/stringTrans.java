package com.example;

/**
 * Created by Isaac on 1/4/17.
 * aaaa -> 4xa, abbbc -> a3xbc, 4444cb -> 4x4cb
 */
public class stringTrans {
    public static String encodeString(String str){
        char temp = 42;
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
            if(str.charAt(i) != temp){
                if(count == 0){
                    result = result + temp;
                }else{
                    result = result + ++count + "x" + temp;
                }
                temp = str.charAt(i);
                //System.out.println(count);
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
            System.out.println(encodeString(""));
    }
}
