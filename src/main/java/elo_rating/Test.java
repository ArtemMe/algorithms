package elo_rating;

public class Test {
    @org.junit.Test
    public void validTest(){
        float a = 2900;
        float b = 2500;

        EloProcessor ep = new EloProcessor();

        System.out.println(ep.calculateNewRating(a, b, -1));
    }
}
