package OOP.call;

import java.util.ArrayList;

public class BlackJackHand extends Hand<BlackJackPlayingCard> {

    /**
     * Считает кол-во очков. Учитывает что туз может быть как 1 так и 11.
     * */
    @Override
    public int getScore() {
        ArrayList<Integer> scores = possibleScores();
        int result = scores.get(0);

        for(int i=1; i<scores.size(); i++) {
            int cur = scores.get(i);
            if(result < cur && cur < 21) result = cur;
        }
        return result;
    }

    /**
     * Возвращает все возможные значения. Учитывает туз 1 или 11;
     * */
    private ArrayList<Integer> possibleScores() {
        return null;
    }

    public boolean busted() {return getScore() >21;}
    public boolean is21() {return getScore() == 21;}
}
