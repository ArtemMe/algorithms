package hacker_rank.ds.alternating_char;

import org.junit.Assert;

public class Test {
    public Answer[] validResult = new Answer[]{
            new Answer(3, new String[]{"AAAA"}),
            new Answer(4, new String[]{"BBBBB"}),
            new Answer(0, new String[]{"BABABA"}),
            new Answer(4, new String[]{"AAABBB"})
    };

    @org.junit.Test
    public void validTest() {
        for(Answer a : validResult) Assert.assertEquals(a.expected, Solution.alternatingCharacters(a.input[0]));
    }

    class Answer {
        public int expected;
        public String[] input;

        public Answer(int numberOfFriends, String[] flowerCosts) {
            this.expected = numberOfFriends;
            this.input = flowerCosts;
        }
    }

}
