package hacker_rank.ds;

public class Solution {
    public int findMaxSumHourglass(int[][] input) {
        int startPointWidth = 0;
        int startPointHigh = 0;
        int hourGlassSize = 3;
        int [] result = new int[16];

        int sum = 0;
        int step = 0;
        for(int k =0; k< 16;k++) {
            for (int i = startPointHigh; i < hourGlassSize + startPointHigh; i++) {
                for (int j = startPointWidth; j < hourGlassSize + startPointWidth; j++) {
                    if (j >= step+startPointWidth && j < hourGlassSize - step+startPointWidth) {
                        sum += input[i][j];
                    }
                }
                if(i < 1+startPointHigh) {
                    step++;
                }else {
                    step--;
                }
            }
            result[k] = sum;
            sum = 0;
            startPointWidth++;
            step = 0;

            if(startPointWidth>3) {
                startPointWidth = 0;
                startPointHigh++;
            }
        }

        return 0;
    }
}
