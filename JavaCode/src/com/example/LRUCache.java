package com.example;

import java.util.HashMap;

/**
 * Created by Isaac on 8/19/18.
 */
public class LRUCache {
    class node{
        node pre;
        node next;
        int key;
        int val;

        node(int key, int val){
            this.key = key;
            this.val = val;
            this.pre = null;
            this.next = null;
        }
    }

    public node head;
    public node tail;
    public int capacity;
    public HashMap<Integer, node> map;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.head = new node(0,0);
        this.tail = new node(0,0);
        this.head.next = this.tail;
        this.tail.pre = this.head;
    }

    public void insertToHead(node target){
        target.next = head.next;
        head.next.pre = target;
        target.pre = head;
        this.head.next = target;

        this.map.put(target.key, target);
    }

    public void remove(node target){
        target.pre.next = target.next;
        target.next.pre = target.pre;
        target.next = null;
        target.pre = null;

        this.map.remove(target.key);

    }

//    public void removeFromTail(){
//        node tmp = tail.pre;
//        tail.pre.pre.next = tail.pre;
//        tail.pre = tail.pre.pre;
//
//        this.map.remove(tmp.key);
//
//    }

    public int get(int key) {
        if(this.map.containsKey(key)){
            node target = this.map.get(key);
            remove(target);
            insertToHead(target);
            return this.map.get(key).val;
        }else{
            return -1;
        }
    }

    public void put(int key, int value) {
        if(this.get(key) == -1){
            if(map.size() >= capacity){
                this.remove(this.tail.pre);
            }
            this.insertToHead(new node(key, value));
        }else{
            this.remove(this.map.get(key));
            this.insertToHead(new node(key, value));
        }

    }
}
