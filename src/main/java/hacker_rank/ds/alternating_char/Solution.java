package hacker_rank.ds.alternating_char;
/**
 * Нужно посчитать сколько удалить букв из строки чтобы вней буквы не повторялись
 * */
public class Solution {
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        StringBuilder stringBuilder = new StringBuilder();

        Character prev = null;
        int counterDeleted  = 0;
        for(Character cur : s.toCharArray()) {
            if(prev == null) {
                prev = cur;
                stringBuilder.append(cur);
                continue;
            }

            if(prev == cur) {
                counterDeleted++;
            } else {
                stringBuilder.append(cur);
            }

            prev = cur;
        }

        return counterDeleted;
    }
}
