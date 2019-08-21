package sorting.quicksort;

public class QuickSort2 {
    public static void sort(int [] in){
        sort(in, 0, in.length-1);
    }

    public static void sort(int[] in, int low, int high) {
        int x = in[low+(high-low)/2];
        int i = low;
        int j = high;

        do{
            while (x>in[i]) i++;
            while (x<in[j]) j--;

            if(i<=j) {
                int tmp = in[i];
                in[i] = in[j];
                in[j] = tmp;
                i++;
                j--;
            }

        } while (i<=j);

        if(low<j) sort(in, low, j);
        if(high >i) sort(in, i, high);
    }
}
