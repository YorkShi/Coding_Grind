package com.example;

public class Str2tree {
    //leetcode 536
    // beats 54.2% submissions
    public static TreeNode str2tree(String s) {
        if(s.length() < 1)
            return null;
        int start1 = s.indexOf("(");
        if(start1 == -1)
            return new TreeNode(Integer.parseInt(s));
        TreeNode node = new TreeNode(Integer.parseInt(s.substring(0, start1)));
        int end1 = 0;
        int start2 = 0;
        int end2 = 0;
        int leftCount = 0;
        for(int i = start1 - 1; i < s.length(); i++){
            if(s.charAt(i) == '('){
                leftCount++;
            }else if(s.charAt(i) == ')'){
                leftCount--;
                if(leftCount == 0){
                    end1 = i;
                    if(i < s.length() - 1){
                        start2 = end1 + 1;
                        end2 = s.length() - 1;
                    }
                    break;
                }
            }
        }
        node.left = str2tree(s.substring(start1+1, end1));
        node.right = (start2 != 0) ? str2tree(s.substring(start2+1, end2)) : null;

        return node;
    }
}
