package elo_rating;

/**
 * Рейтинг эло
 * */

public class EloProcessor {
    public double calculateNewRating(float userRating, float opponentRating, int winnerFlag) {
        float sa = 0;  // значение присваиваемое в случае выйгрыша проигрыша
        double ea = 0; // ожидаемое кол-во очков
        int k = 16;    // коф-т максимальное количество очков которое можно получить за раз

        if(winnerFlag > 0) {
            sa = 1;
        } else if(winnerFlag < 0) {
            sa = 0;
        } else sa = 0.5f;

        ea = 1/(1 + Math.pow(10,(opponentRating-userRating)/400)); // ожидаемое кол-во очков

        return userRating + k*(sa-ea);
    }
}
