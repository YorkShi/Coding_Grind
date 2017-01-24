package com.example;
import java.util.*;
/**
 * Created by Isaac on 1/4/17.
 */
public class TestMain {
        public static void main(String[] args){

            //zig zag conversion test case
            String s = "PAYPALISHIRING";
            int nRows = 3;
            //System.out.println(zigzag.convert(s,nRows));

            //reverse Integer
            final int RI_INT = 1534236469;
            //System.out.println(ReverseInteger.reverse(RI_INT));

            //Regular Expression Match
            String REM_STRING_1 = "aab";
            String REM_STRING_2 = "c*a*b";
            //System.out.println(RegulaExpressionMatching.isMatch(REM_STRING_1, REM_STRING_2));

            //most area test case
            int[] MA_INT_ARRAY = {1,2,4,3};
            //System.out.print(MostArea.maxArea(MA_INT_ARRAY));

            //integer to Roman test case
            //leetcode 3999 out of 3999 test cases passed
            final int INTEGER2ROMAN_INT = 1011;
            //System.out.println(Integer2Roman.intToRoman(INTEGER2ROMAN_INT));

            //roman to Integer test case
            //leetcode test case passed by 3999/3999
            final String ROMAN2INTEGER_STRING = "MCDLXXVI";
            //System.out.println(Roman2Int.convert(ROMAN2INTEGER_STRING));
            //System.out.println(ROMAN2INTEGER_STRING.substring(1));

            //longest Common prefix problem
            //
            String[] LONGEST_COMMON_PREFIX_STRINGARRAY = {"abcedf","abce","abcefg","abc","ab"};
            //System.out.println(LongestCommonPrefix.lookup(LONGEST_COMMON_PREFIX_STRINGARRAY));

            //Elimination game from L to R and from R to L
            //leetcode 2368/3377 test case passed
            //time limit exceeded for inout "5271"
            final int ELIMINATION_INT = 5271;
            //System.out.print(Elimination.lastRemain(ELIMINATION_INT));
            final int[][] TEST_INT_ARRAY = {
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,16}
            };

            final int[][] test = {{1}};

            //System.out.println(MinimumPath.miniPath(test));

            //Longest absolute file path problem
            String LONGEST_PATH_STRING = "dir\n\tsubdir1\n\t\tfile1.ext\n\t\tsubsubdir1\n\tsubdir2\n\t\tsubsubdir2\n\t\t" +
                    "\tfile2.ext";
            //log(LongestFilePath.longestLengthPath(LONGEST_PATH_STRING));

            //practice on binarysearch
            int[] A = {1,2,3,4,5,6,7,8,9,10,11,12,15,18,20};
            int n = A.length;
            int key = 2;
            //log(BinarySearch.binarySearch(A,n,key));

            //practice on binarysort
            int[] nums = {0,1,1,1,1,0,0,1,0,1,0,1,0,0,0,1,0,1};
            //for(int est:BinarySort.binarySort(nums))
            //    System.out.print(est + ",");

            //practice on mergesort
            List<Integer> nums1 = new ArrayList<>();
            {
                nums1.add(4);
                nums1.add(1);
                nums1.add(2);
                nums1.add(11);
                nums1.add(7);
                nums1.add(8);
            }
            for(Integer merge_s:MergeSort.mergeSort(nums1)) {
                log(merge_s);
            }

            //UTF8 validation test case
            int[] data = {235,140,4};
            System.out.println(UTF8Verify.verify(data));
        }

        static void log(Object str){
            System.out.println(str);
        }

}
