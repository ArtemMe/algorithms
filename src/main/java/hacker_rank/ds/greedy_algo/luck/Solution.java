package hacker_rank.ds.greedy_algo.luck;

import java.util.Arrays;

public class Solution {
    // Complete the luckBalance function below.
    static int luckBalance(int k, int[][] contests) {
        int[] important = new int[contests.length];
        int importantCounter = 0;
        int sumOfLick = 0;

        for(int i=0; i < contests.length; i++) {
            int l = contests[i][0];
            int t = contests[i][1];

            if(t == 1) {
                important[importantCounter] = l;
                importantCounter++;
            } else {
                sumOfLick = sumOfLick + l;
            }

        }

        Arrays.sort(important);

        for(int i=important.length-1; i >= 0; i--) {
            if(i>important.length-1-k) {
                sumOfLick = sumOfLick + important[i];
            } else {
                sumOfLick = sumOfLick - important[i];
            }
        }

        return sumOfLick;
    }
}
