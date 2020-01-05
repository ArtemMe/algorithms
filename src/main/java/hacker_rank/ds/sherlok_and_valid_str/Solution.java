package hacker_rank.ds.sherlok_and_valid_str;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    // Complete the isValid function below.
    static String isValid(String s) {
        String wrongAns = "NO";
        String rightAns = "YES";

        int[] characterCounter = new int[26];
        int shift = 'a';

        for(char c : s.toCharArray()) ++characterCounter[c-shift];
        boolean haveDiff = false;
        int amountChar = 0;

        for(int i=0; i < characterCounter.length; i++) {
            if(characterCounter[i] == 0) continue;

            if(amountChar == 0) {
                amountChar = characterCounter[i];
                continue;
            }

            if(amountChar != characterCounter[i]){
                if((amountChar - characterCounter[i]) == -1) {
                    if(haveDiff) return wrongAns;
                    haveDiff = true;
                } else if((amountChar - characterCounter[i]) >= 1 && characterCounter[i]==1){
                    if(haveDiff) return wrongAns;
                    haveDiff = true;
                } else {
                    return wrongAns;
                }
            }
        }

        return rightAns;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        String s = scanner.nextLine();

        String result = isValid(s);

        System.out.println(result);
        scanner.close();
    }
}
