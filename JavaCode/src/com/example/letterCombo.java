package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Isaac on 8/19/18.
 */
public class letterCombo {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<String>();

        //border case
        if(digits == null){
            return result;
        }

        HashMap<String, ArrayList<String>> map = new HashMap<String, ArrayList<String>>();

        //List<String> list1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        map.put("2", new ArrayList<>(Arrays.asList("a", "b", "c")));
        map.put("3", new ArrayList<>(Arrays.asList("d", "e", "f")));
        map.put("4", new ArrayList<>(Arrays.asList("g", "h", "i")));
        map.put("5", new ArrayList<>(Arrays.asList("j", "k", "l")));
        map.put("6", new ArrayList<>(Arrays.asList("m", "n", "o")));
        map.put("7", new ArrayList<>(Arrays.asList("p", "q", "r", "s")));
        map.put("8", new ArrayList<>(Arrays.asList("t", "u", "v")));
        map.put("9", new ArrayList<>(Arrays.asList("w", "x", "y", "z")));

        addAllLetterSequences("", digits, result, map);

        return result;

    }

    void addAllLetterSequences(String prefix, String digits, List<String> result, HashMap<String, ArrayList<String>> map) {
        //System.out.println(prefix);
        if (prefix.length() < digits.length()){
            ArrayList<String> tmp = map.get(Character.toString(digits.charAt(prefix.length())));
            for (int i = 0; i < tmp.size(); i++) {
                addAllLetterSequences(prefix + tmp.get(i), digits, result, map);
            }
        }else{
            result.add(prefix);
        }
    }
}
