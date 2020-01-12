package hacker_rank.greedy_algo.maxMin;

import java.util.Arrays;

public class Solution {

    // Complete the maxMin function below.
    static int maxMin(int k, int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;

        for(int i=0; i<=arr.length-k; i++) {
            int curMin =arr[i+k-1] - arr[i];
            if(curMin < min) {
                min = curMin;
            }
        }

        return min;
    }
}
