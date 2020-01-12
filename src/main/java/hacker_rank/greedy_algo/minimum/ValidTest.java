package hacker_rank.greedy_algo.minimum;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class ValidTest {

    private Map<Integer, int[]> validData = new HashMap()
    {{
            put(1, new int[]{-59, -36, -13, 1, -53, -92, -2, -96, -54, 75});
            put(2, new int[]{3,1,9});
            put(3, new int[]{1,2,3});
    }};

    @Test
    public void validTest() {
        for(Map.Entry<Integer, int[]> e : validData.entrySet()) {
            Assert.assertEquals((int) e.getKey(), Solution.minimumAbsoluteDifference(e.getValue()));
        }
    }
}
