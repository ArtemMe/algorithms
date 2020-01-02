package hacker_rank.ds.greedy_algo.reverse_shuffle_merge;

import org.junit.Assert;

public class Test {
    private Answer[] validString = new Answer[]{
            new Answer("aegeaggg","gaeg")
    };

    @org.junit.Test
    public void validTest() {
        Solution s = new Solution();

        for(Answer a : validString) Assert.assertEquals(a.result, Solution.reverseShuffleMerge(a.input));
    }

    class Answer {
        public String input;
        public String result;

        public Answer(String input, String result) {
            this.input = input;
            this.result = result;
        }
    }
}
