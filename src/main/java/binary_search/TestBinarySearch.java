package binary_search;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;


public class TestBinarySearch {
    int [] mass = {1,3,4,6,7,8,9,10};
    private HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(){{
        put(1, 0);
        put(8, 5);
        put(10, 7);
    }};

    @Test
    public void test1(){
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            int res = BinarySearch.find(e.getKey(), mass);
            System.out.println(e.getKey()+" "+ e.getValue() + " = "+res);
            Assert.assertTrue(res == e.getValue());
        }
    }
}
