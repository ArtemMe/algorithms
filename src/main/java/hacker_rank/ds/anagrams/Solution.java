package hacker_rank.ds.anagrams;

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {

        int asciiShift = 'a';
        int[] aArr = new int[26];

        for(char c : a.toCharArray()) ++aArr[c-asciiShift];
        for(char c : b.toCharArray()) --aArr[c-asciiShift];

        int sum = 0;
        for(int i : aArr) sum = sum+Math.abs(i);

        return sum;
    }


}
