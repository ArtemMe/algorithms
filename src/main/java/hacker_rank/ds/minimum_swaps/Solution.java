package hacker_rank.ds.minimum_swaps;

public class Solution {
    static int minimumSwaps(int[] arr) {
        int[] result = new int[arr.length-1];
        int counter = 0;
        for(int i=arr.length-1; i>0 ;i--) {
            int curr = arr[i];

            if(curr -1 == i) continue;

            for(int j =i-1; j>=0 ;j--) {
                int sec = arr[j];

                if(sec -1 == j) continue;

                if(sec -1 == i) {
                    swap(arr, i, j);
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }

    static void swap(int[] in, int first, int second) {
        int temp = in[first];
        in[first] = in[second];
        in[second] = temp;
    }
}
