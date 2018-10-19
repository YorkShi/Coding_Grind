package com.example;
//leetcode 98
public class IsValidBST {

    public static boolean isValidBST(TreeNode root) {
        if(root == null)
            return true;
        if(root.left == null && root.right == null)
            return true;
        boolean leftRes = true;
        boolean rightRes = true;
        if(root.left != null){
            leftRes = (root.val > maxValue(root.left)) && isValidBST(root.left);
        }
        if(root.right != null){
            rightRes = (root.val < minValue(root.right)) && isValidBST(root.right);
        }
        return leftRes && rightRes;
    }

    public static int maxValue(TreeNode node){
        if(node.right == null){
            return node.val;
        }else{
            return maxValue(node.right);
        }
    }

    public static int minValue(TreeNode node){
        if(node.left == null){
            return node.val;
        }else{
            return minValue(node.left);
        }
    }
}
