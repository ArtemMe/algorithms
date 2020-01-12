package OOP.cards;

public class BlackJackPlayingCard extends PlayingCard {
    @Override
    public int getValue() {
        if(getNumber() == 1) return 11;
        else if(getNumber()>= 11 && getNumber()<=13) return 10;

        return getNumber();
    }
}
