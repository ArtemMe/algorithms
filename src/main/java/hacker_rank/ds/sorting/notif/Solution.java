package hacker_rank.ds.sorting.notif;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Solution {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
        int notifCounter = 0;
        int range = 200;
        int[] currDays = sort(expenditure, range, 0, d);
        double mid = findMid(currDays, d);

        for(int i=0; i<expenditure.length - d; i++) {
            if(i!=0) {
                recalculate(currDays, expenditure[i+d-1], expenditure[i-1]);
            }
            mid = findMid(currDays, d);

            if(mid*2 <= expenditure[i+d]) {
                notifCounter++;
            }
        }
        return notifCounter;
    }

    private static int[] sort(int[] input, int range, int startPoint, int endPoint) {
        int[] result = new int[range];

        for(int j = startPoint; j < endPoint; j++) {
            result[input[j]] ++;
        }

        return result;
    }

    private static void recalculate(int[] input, int addNum, int removeNum) {
        input[addNum] ++;
        input[removeNum] --;
    }

    private static double findMid(int[] input, int numberAmount) {
        boolean isOddNumber = numberAmount%2 == 0 ? false : true;
        int midPoint;
        if(isOddNumber) {
            midPoint = (numberAmount/2)+1;
        } else {
            midPoint = numberAmount/2;
        }
        int counter = 0;
        int left = 0;
        int right = 0;

        while(counter < midPoint) {
            counter += input[left];
            left++;
        }

        right = left;
        left --;

        if(counter > midPoint || isOddNumber) return left;
        else {
            while(input[right] == 0) {
                right++;
            }
            return (right+left)/2.0;
        }
    }

    public static void main(String[] args) throws IOException {
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        Scanner scanner = new Scanner(new File("C:\\Users\\amejelovskiy\\Desktop\\te.txt"));
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);
        System.out.println(result);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedWriter.close();

        scanner.close();
    }

}
