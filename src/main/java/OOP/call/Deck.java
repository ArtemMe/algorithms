package OOP.call;

import java.util.ArrayList;

public class Deck <T extends PlayingCard>{
    private ArrayList<T> cards = new ArrayList<>();
    private int numberLostCard;

    public void setDeckOfCard(ArrayList<T> cards) {
        this.cards = cards;
    }

    /**
     * Мешает колоду
     * */
    public void mix() {
        System.out.println("Мешаем колоду...");
    }

    /**
     * Выдает на руки карты
     * */
    public T[] dealHand(int number){
        return null;
    }

    /**
     * Выдает из колоды карту
     * */
    public T dealCard() {
        return null;
    }

    public int getCurrentDeckSize() {
        return cards.size() - numberLostCard;
    }
}
