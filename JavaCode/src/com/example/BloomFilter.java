/**
 * Created by 13104584d on 16/11/2016.
 */
package com.example;
import java.io.*;
import java.math.*;
public class BloomFilter {
    private String[] lines;
    private int size;
    private int [] result;
    private int hashCount;
    private static final Long INIT32  = Long.parseLong("811c9dc5", 16);
    private static final Long PRIME32 = Long.parseLong("01000193", 16);

    public static void main(String [] args){
        int size = Integer.parseInt(args[0]);
        String documentName = args[1];
        String testName = args[2];
        int i = 0;
        int j = 0;
        try {
            BufferedReader fileIn = new BufferedReader(new FileReader(documentName));
            BufferedReader fileIn2 = new BufferedReader(new FileReader(testName));

            int documentSize = Integer.parseInt(fileIn.readLine());
            int testSize = Integer.parseInt(fileIn2.readLine());
            String [] lines = new String [documentSize];
            String [] tests = new String [testSize];
            for(; i < documentSize;){
                lines[i] = fileIn.readLine(); // Reads one line from the file
                i++;
            }
            for(; j < testSize;){
                tests[j] = fileIn2.readLine(); // Reads one line from the file
                j++;
            }
            fileIn.close();
            fileIn2.close();
            BloomFilter BloomFilter = new BloomFilter(lines, size, 2);
            BloomFilter.add();
            for(int k = 0; k < tests.length; k++){
                System.out.println(BloomFilter.lookUp(tests[k]));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public BloomFilter(String[] lines, int size, int hashCount){
        this.lines = lines;
        this.hashCount = hashCount;
        this.size = size;
        this.result = new int [size];
        for (int i = 0; i < size; i++){
            result[i] = 0;
            //System.out.print(result[i]);
        }

    }

    public void add(){
        //result = new int [hashCount];
        int result1;
        int result2;
        for(int i = 0; i < this.lines.length; i++){
            result1 = (int) this.fnv1_32(lines[i]);
            result2 = (int) this.hash(lines[i]);
            System.out.print(result1+",");
            System.out.println(result2);
            result[result1] = 1;
            result[result2] = 1;
            //System.out.println(lines[i]);
        }
        for (int j = 0; j < this.size; j++)
            System.out.print(result[j]+",");
        System.out.println();
    }

    public double fnv1_32(String input) {
        Long hash = INIT32;
        char[] data = new char [input.length()];
        for(int i = 0; i < input.length(); i++)
            data[i] = input.charAt(i);
        for (char b : data) {
            hash = hash*(PRIME32);
            hash = hash^b;
        }
        float temp =  hash % Long.parseLong("100", 10);
        if(temp < 0)
            temp += 100;
        return temp;
    }

    public double hash(String string){
        double temp = 0;
        for(int i = 0; i < string.length(); i++) {
            temp += (string.charAt(i) - 96) * Math.pow(2, 3 + 3*i);
            //System.out.println(temp);
        }
        return (temp % this.size);
    }


    public String lookUp(String string){
        double result1 = this.fnv1_32(string);
        double result2 = this.hash(string);
        System.out.printf(result1+",");
        System.out.println(result2);
        double setBitCount = 0;
        for (int i = 0; i < this.size; i++)
            if(this.result[i] == 1){
                setBitCount += 1;
            }
        double prob = Math.round(Math.pow(setBitCount/100,2) * 100);

        return (this.result[(int) result1] == 1 && this.result[(int) result2] == 1) ? "Maybe "+prob+"%":"No";
    }
}
