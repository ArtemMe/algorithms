package OOP.cards;

/**
 * Модель рангов
 * */
public class Rank {
    public static final Rank ACE = new Rank(1);
    public static final Rank KING = new Rank(11);
    public static final Rank QUEEN = new Rank(12);
    public static final Rank JACK = new Rank(13);

    private int rank;

    public Rank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
}
