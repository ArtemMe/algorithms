package sorting.selection_sort;

import org.junit.Test;

public class TestSelectionSort {
    private int[] arr = {3,92,5,7,7,0};

    @Test
    public void test1(){
        int[] res = SelectionSort.sort(arr);
        for(int i : res)System.out.println(i);
    }

    @Test
    public void test2(){
        int[] res = SelectionSort.sort2(arr);
        for(int i : res)System.out.println(i);
    }
}
