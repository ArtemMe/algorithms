package hacker_rank.ds.greedy_algo.greedy_florist;

import java.util.Arrays;

public class Solution {
    // Complete the getMinimumCost function below.
    // k - number of friends
    // c - flowers costs
    static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int multiplier = 1;
        int multiplierCounter = 0;
        int sum =0;
        for(int i=c.length-1; i >= 0; i--) {
            if(multiplierCounter < k) {

            } else {
                multiplier++;
                multiplierCounter = 0;
            }

            sum+= c[i]*multiplier;
            multiplierCounter++;
        }
        return sum;
    }
}
