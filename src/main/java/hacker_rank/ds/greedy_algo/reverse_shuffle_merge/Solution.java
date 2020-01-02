package hacker_rank.ds.greedy_algo.reverse_shuffle_merge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    // Complete the reverseShuffleMerge function below.
    static String reverseShuffleMerge(String s) {
        StringBuilder result = new StringBuilder();
        HashMap<Character, Integer> numberOfLetters = (HashMap<Character, Integer>) countLetters(s);

        String reversed = new StringBuilder(s).reverse().toString();

        for(int i = 0; i< reversed.length(); i++){
            Character c = reversed.charAt(i);


        }

        return "";
    }

    private static Map<Character, Integer> countLetters(String input) {
        HashMap<Character, Integer> numberOfLetters = new HashMap<>();

        for(int i=0;i< input.length(); i++) {
            Character c = input.charAt(i);
            if(numberOfLetters.containsKey(c)) {
                Integer counter = numberOfLetters.get(c);
                numberOfLetters.put(c, ++counter);
            } else {
                numberOfLetters.put(c, 1);
            }
        }
        return numberOfLetters;
    }

}
