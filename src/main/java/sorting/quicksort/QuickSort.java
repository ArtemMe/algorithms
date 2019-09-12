package sorting.quicksort;

public class QuickSort {
    public static void sort(int[] arr){
        sort(arr, 0, arr.length-1);
    }

    private static void sort(int[] arr, int low, int high){
        int i = low;
        int j = high;
        int x = arr[low+(high-low)/2];
        do {
            while (x>arr[i]) ++i;
            while (x<arr[j]) --j;

            if(i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++; j--;
            }
        }while (i<=j);

        if(low<j) sort(arr,low,j);
        if(i<high) sort(arr, i, high);
    }
}
