package OOP.call;

import java.util.ArrayList;

/**
 * Базовый класс для выданных карт
 * */
public abstract class Hand <T extends PlayingCard> {
    private ArrayList<T> cards = new ArrayList<>();

    public int getScore() {
        int sum = 0;
        for(T card : cards) {
            sum += card.getValue();
        }
        return sum;
    }

    public void addCard(T card) {
        cards.add(card);
    }

    public ArrayList<T> getCards(){
        return cards;
    }
}
