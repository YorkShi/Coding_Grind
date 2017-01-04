package com.example;
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
            if(str.equals(null)){
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

    public static String decodeString(String str){
        String temp = "";
        String result = "";

        //border case
        //including invalid input
        if(str.length() < 2)
            return str;

        //main function
        for(int i = 0; i < str.length(); i++){
            String temp2 = String.valueOf(str.charAt(i));
            if(temp2.equals("x") && isStringInt(temp)){
                for(int j = 0; j < Integer.parseInt(temp); j++) {
                    result += str.charAt(i + 1);
                }
                temp = "";
                i++;
            }else{
                result += temp;
                temp = temp2;
            }

            if(i == str.length() - 1){
                result += temp2;
            }
        }

        return result;
    }

    public static boolean isStringInt(String str){
        try
        {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }

    public static void main(String [] args){
            System.out.println(encodeString("aabbccc"));
            System.out.println(decodeString("2xa2xbgfh3xcdfg"));
    }
}
