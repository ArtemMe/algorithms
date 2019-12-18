package hacker_rank.ds.greedy_algo.luck;

import org.junit.Assert;

public class Test {
    public int[][] validResult = new int [][]{
            {5,1},
            {2,1},
            {1,1},
            {8,1},
            {10,0},
            {5,0}
    };

    public int[][] validResult2 = new int [][]{
            {5,1},
            {4,0},
            {6,1},
            {2,1},
            {8,0}
    };

    public int[][] validResult3 = new int [][]{
            {13,1},
            {10,1},
            {9,1},
            {8,1},
            {13,1},
            {12,1},
            {18,1},
            {13,1}
    };

    @org.junit.Test
    public void validTest() {
        Solution s = new Solution();
        Assert.assertEquals(29, s.luckBalance(3, validResult));
    }

    @org.junit.Test
    public void validTest2() {
        Solution s = new Solution();
        Assert.assertEquals(21, s.luckBalance(2, validResult2));
    }

    @org.junit.Test
    public void validTest3() {
        Solution s = new Solution();
        Assert.assertEquals(42, s.luckBalance(5, validResult3));
    }
}
