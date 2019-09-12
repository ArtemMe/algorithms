package sorting.selection;

public class Test {
    private int[] arr = {3,92,5,7,7,0};

    @org.junit.Test
    public void test1(){
        Selection.sort(arr);
        for(int i : arr)System.out.println(i);
    }
}
