package hacker_rank.ds.chaos_queue;

import java.sql.SQLOutput;

public class Solution {
    static String minimumBribes(int[] q) {
        int[] counter = new int[q.length+1];

        for(int i=0; i<q.length; i++) {
            int curr = q[i];
            int v = 0;

            if(curr != i+1) {
                v = Math.abs((curr - 1) - i);
                counter[curr] = v;
            }

            if(v>2) return "Too chaotic";
        }

        int sum = 0;
        for(int i=0;i<counter.length;i++) {
            sum += counter[i];
        }

        return String.valueOf(sum/2);
    }

    static String minimumBribes2(int[] q) {
       int ans = 0;

       for(int i=q.length-1;i>=0;i--) {
           if(q[i] - (i + 1) > 2) {
               System.out.println("Too chaotic");
           }

           for(int j = Math.max(0, q[i] -2); j<i;j++) {
               if(q[j] > q[i]) ans++;
           }
       }
       System.out.println(ans);

       return String.valueOf(ans);
    }
}
