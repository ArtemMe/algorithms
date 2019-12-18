package hacker_rank.ds.chaos_queue;

import org.junit.Assert;

public class Test {

    int[] q = new int[] {2, 1, 5, 3, 4};
    int[] q2 = new int[] {1, 2, 5, 3, 7, 8, 6, 4};

    @org.junit.Test
    public void test() {
        Assert.assertEquals(3, Integer.parseInt(Solution.minimumBribes(q2)));
    }


    @org.junit.Test
    public void test2() {
        Assert.assertEquals(String.valueOf(7), Integer.parseInt(Solution.minimumBribes2(q2)));
    }
}
