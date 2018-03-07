package com.company;
import java.util.Map;
import java.util.HashMap;

public class StringMapping {

    public static Map letter_histogram(String word){

        Map<Character, Integer> tally = new HashMap<Character, Integer>();
        for(int i=0; i < word.length(); i++){
            if(tally.containsKey(word.charAt(i))) {
                tally.replace(word.charAt(i), tally.get(word.charAt(i)) + 1);
            }else{
                tally.put(word.charAt(i), 1);
            }
        }

        return tally;
    }
}
