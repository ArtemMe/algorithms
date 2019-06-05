package quicksort;

import org.junit.Test;

public class TestQuickSort {

    int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    @Test
    public void test1(){
        QuickSort.sort(arr);

        for(int i : arr) System.out.println(i);
    }
}
