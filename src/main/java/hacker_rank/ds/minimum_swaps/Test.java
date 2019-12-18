package hacker_rank.ds.minimum_swaps;

import org.junit.Assert;

public class Test {

    int[] q = new int[] {2, 3, 4, 1, 5};
    int[] q2 = new int[] {1, 2, 5, 3, 7, 8, 6, 4};

    @org.junit.Test
    public void test2() {
        Assert.assertEquals(3, Solution.minimumSwaps(q));
    }
}
