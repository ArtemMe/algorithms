package hacker_rank.ds.array_manipulation;

import org.junit.Assert;

public class Test {

    int[][] q2 = new int[][] {
            {1,2,100},
            {2,5,100},
            {3,4,100}
    };

    @org.junit.Test
    public void test() {
        Assert.assertEquals(200, Solution.arrayManipulatio2(5, q2));
    }
}
