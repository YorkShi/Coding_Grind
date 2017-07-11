package com.example;

/**
 * Created by Isaac on 2/6/17.
 */
public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;

    }
    public TreeNode(int val, TreeNode sth, Boolean dir){
        if(dir)
            this.left = sth;
        else
            this.right =sth;
        this.val = val;
    }
    public TreeNode(int val, TreeNode left, TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public int getVal(){
        return this.val;
    }

    public void setVal(int val){
        this.val = val;
    }

    public TreeNode getLeft(){
        return this.left;
    }

    public void setLeft(TreeNode left){
        this.left = left;
    }

    public TreeNode getRight(){
        return this.right;
    }

    public void setRight(TreeNode right){
        this.right = right;
    }

    public TreeNode lookUp(int target){
        return null;
    }

    public void insert(int target){

    }
}

