package hacker_rank.greedy_algo.minimum;

import java.util.Arrays;

public class Solution {
    static int minimumAbsoluteDifference(int[] arr) {
        Arrays.sort(arr);

        int min = Integer.MAX_VALUE;

        for(int i=0; i< arr.length; i++) {
            int diff = min;

            if(i+1 >= arr.length) {
                diff = Math.abs(arr[i]-arr[i-1]);
            }else {
                diff = Math.abs(arr[i]-arr[i+1]);
            }

            if(diff < min) min = diff;
        }

        return min;
    }
}
