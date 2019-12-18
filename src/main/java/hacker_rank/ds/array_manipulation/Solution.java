package hacker_rank.ds.array_manipulation;

import java.util.Arrays;

public class Solution {
    static long arrayManipulatio(int n, int[][] queries) {
        long[] result = new long[n];
        long maxValue = 0;

        for(int i=0; i<queries.length; i++) {
            int startIndex = queries[i][0] - 1;
            int endIndex = queries[i][1] - 1;
            int value = queries[i][2];

            for(int j = startIndex; j <= endIndex; j++) {
                long insertVal = result[j] + value;
                result[j] = insertVal;

                if(insertVal > maxValue) {
                    maxValue = insertVal;
                }
            }

        }

        return maxValue;
    }

    static long arrayManipulatio2(int n, int[][] queries) {
        long[] result = new long[n+2];

        for(int i=0; i<queries.length; i++) {
            int startIndex = queries[i][0];
            int endIndex = queries[i][1] ;
            int value = queries[i][2];
            result[startIndex] += value;
            result[endIndex+1] -= value;
        }


        return getMax(result);
    }

    private static long getMax(long[] input) {
        long max = Long.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i < input.length; i++) {
            sum += input[i];
            max = Math.max(max, sum);
        }
        return max;
    }

    static void fillArray(int[] input, int startIndex, int endIndex, int value) {
        for(int i = startIndex; i <=endIndex; i++) {
            input[i] = input[i] + value;
        }
    }
}
