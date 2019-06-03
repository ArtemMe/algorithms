package binary_search;

import org.junit.Test;

public class TestBinarySearch {

    private int [] mass = {1,3,4,6,7,8,9,10};

    @Test
    public void test1(){
        System.out.println(BinarySearch.find(7, mass));
    }
}
