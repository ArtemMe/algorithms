package OOP.call;

/**
 * Модель игральной карты
 * */
public abstract class PlayingCard {
    private int number;
    private Color color;
    private Suit suit;
    private Rank rank;

    /**
     * Возвращает номмнал карты в зависимости от вида игры.
     * */
    public abstract int getValue();

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }
}
