package sorting.bublesort;

import org.junit.Test;

public class BubleTest {

    int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    @Test
    public void valid(){
        Buble.sort(arr);
        for(int i : arr) System.out.println(i);
    }
}
