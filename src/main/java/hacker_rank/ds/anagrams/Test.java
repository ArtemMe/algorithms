package hacker_rank.ds.anagrams;

import org.junit.Assert;

public class Test {
    public Answer[] validResult = new Answer[]{
            new Answer(4, new String[]{"cde", "abc"})
    };

    @org.junit.Test
    public void validTest() {
        for(Answer a : validResult) Assert.assertEquals(a.expected, Solution.makeAnagram(a.input[0], a.input[1]));
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
