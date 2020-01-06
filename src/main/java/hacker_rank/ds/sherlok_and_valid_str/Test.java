package hacker_rank.ds.sherlok_and_valid_str;

import org.junit.Assert;

public class Test {
    public Answer[] validResult = new Answer[]{
            new Answer("NO", new String[]{"aabbcd"}),
            new Answer("NO", new String[]{"aabbccddeefghi"}),
            new Answer("YES", new String[]{"abcdefghhgfedecba"}),
            new Answer("YES", new String[]{"aabbc"})
    };

    @org.junit.Test
    public void validTest() {
        for(Answer a : validResult) {
            System.out.println("For input: " + a.input[0]);
            Assert.assertEquals(a.expected, Solution.isValid(a.input[0]));}
    }

    class Answer {
        public String expected;
        public String[] input;

        public Answer(String expected, String[] flowerCosts) {
            this.expected = expected;
            this.input = flowerCosts;
        }
    }

}
