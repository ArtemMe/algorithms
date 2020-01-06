package sorting.quicksort;

public class QuickSort2 {
    public static void sort(int [] in){
        sort(in, 0, in.length-1);
    }

    public static void sort(int[] in, int low, int high) {
        int i = low;
        int j = high;
        int pivot = in[low+(low+high)/2];

        do{
            while (pivot > in[i]) i++;
            while (pivot < in[j]) j--;

            if(i<=j) {
                swap(in, i, j);
                i++; j--;
            }
        } while (i<=j);

        if(i< high) sort(in, i, high);
        if(j> low) sort(in, low, j);
    }

    private static void swap(int[] in, int a, int b) {
        int tmp = in[a];
        in[a] = in[b];
        in[b] = tmp;
    }
}
