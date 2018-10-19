package com.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LadderLength {
    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        if(wordList.size() < 1 || !wordList.contains(endWord))
            return 0;
        Map<String, Integer> ladder = new HashMap<>();
        Map.Entry<String,Integer> entry;
        Iterator<Map.Entry<String,Integer>> it;
        ladder.put(beginWord, 1);
        it = ladder.entrySet().iterator();
        int i = 0;
        while(!ladder.containsKey(endWord)){
            Map<String, Integer> tmp = new HashMap<>();
            for(String key : ladder.keySet()){
                Integer value = ladder.get(key) + 1;
                for(String word : wordList){
                    if(ifTransformed(key, word)){
                        tmp.put(word, value);
                    }
                }
            }
            if(tmp.size() == 0)
                return 0;
            ladder = tmp;
        }
        return ladder.get(endWord);
    }

    public static boolean ifTransformed(String a, String b){
        int diff = 0;
        for(int i = 0; i < a.length(); i++){
            if(a.charAt(i) != b.charAt(i))
                diff++;
        }

        return (diff == 1);
    }
}
