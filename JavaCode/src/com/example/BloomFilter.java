/**
 * Created by 13104584d on 16/11/2016.
 */
package com.example;
import java.io.*;
public class BloomFilter {
    private String[] lines;
    private int size;
    private int [] result;
    private int hashCount;

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
            while(fileIn.readLine() != null){
                lines[i] = fileIn.readLine(); // Reads one line from the file
                i++;
            }
            while(fileIn2.readLine() != null){
                tests[j] = fileIn2.readLine(); // Reads one line from the file
                j++;
            }
            fileIn.close();
            fileIn2.close();
            BloomFilter BloomFilter = new BloomFilter(lines, size, 2);
            BloomFilter.add();
            for(int k = 0; k < tests.length; k++){
                BloomFilter.lookUp(tests[k]);
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
        }

    }

    public void add(){
        //result = new int [hashCount];
        double result1;
        double result2;
        for(int i = 0; i < this.lines.length; i++){
            result1 = this.hash(lines[i], 1);
            result2 = this.hash(lines[i], 2);
            //System.out.println(result1);
            //System.out.println(result2);
            result[(int) result1 - 1] = 1;
            result[(int) result2 - 1] = 1;

            //System.out.println(lines[i]);
            /*for (int j = 0; j < this.size; j++)
                System.out.print(result[j]);
            System.out.println();*/
        }
    }

    public double hash(String string, int hashcount){
        double temp = 0;
       // int temp2 = 0;
        for(int i = 0; i < string.length(); i++) {
            temp += ((double) string.charAt(i) - 96) * Math.pow(3, hashcount + i + 1);
            //System.out.println(temp);
        }

        return (temp % this.size);
    }


    public void lookUp(String string){
        double result1 = this.hash(string,1);
        double result2 = this.hash(string,2);
        System.out.println((this.result[(int) result1 - 1 ] == 1 && this.result[(int) result2 - 1] == 1) ? "Probably":"Np");
    }
}
