package hacker_rank.ds.sorting.notif;

import org.junit.Assert;

public class Test {
    public Answer[] validResult = new Answer[] {
            new Answer<Integer> (2, 4, new int[] {2, 3, 4, 2, 3, 6, 8, 4, 5})
    };


    @org.junit.Test
    public void validTest() {
        for(Answer a : validResult)
            Assert.assertEquals(a.expected, Solution.activityNotifications(a.input, a.notif));
    }

    class Answer<T> {
        public T expected;
        public int notif;
        public int[] input;

        public Answer(T expected, int notif, int[] input) {
            this.expected = expected;
            this.input = input;
            this.notif = notif;
        }
    }

}
