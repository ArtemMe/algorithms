package sorting.merge;

import org.junit.Test;
import sorting.quicksort.QuickSort;
import sorting.quicksort.QuickSort2;

public class TestQuickSort {

    int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    @Test
    public void test1(){
        int[] mass = Merge.sort(arr);

        for(int i : mass) System.out.println(i);
    }
    
}
