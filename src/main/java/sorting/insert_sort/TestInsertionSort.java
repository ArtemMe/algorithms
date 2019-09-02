package sorting.insert_sort;

import org.junit.Test;
import sorting.merge.Merge;

public class TestInsertionSort {
    int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};

    @Test
    public void test1(){
        int[] mass = InsertionSort.sort(arr);

        for(int i : mass) System.out.println(i);
    }
}
