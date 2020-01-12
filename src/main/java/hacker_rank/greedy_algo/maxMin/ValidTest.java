package hacker_rank.greedy_algo.maxMin;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ValidTest {

    private Map<Integer, int[][]> validData = new HashMap()
    {{
            put(20, new int[][]{{3},{10, 100, 300, 200, 1000, 20, 30}});
            put(0, new int[][]{{2},{1, 2, 1, 2, 1}});
            put(2, new int[][]{{3},{100, 200, 300, 350, 400, 401, 402}});
//            put(2, new int[]{3,1,9});
//            put(3, new int[]{1,2,3});
    }};

    @Test
    public void validTest() {
        for(Map.Entry<Integer, int[][]> e : validData.entrySet()) {
            Assert.assertEquals((int) e.getKey(), Solution.maxMin(e.getValue()[0][0], e.getValue()[1]));
        }
    }
}
