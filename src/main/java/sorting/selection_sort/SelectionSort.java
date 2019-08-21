package sorting.selection_sort;


/**
 * Сортировка выбором
 *
 * */
public class SelectionSort {
    public static int[] sort(int[] arr){
        int[] res = new int[arr.length];

        for(int i=0; i < arr.length; i++){
            int smalest = findSmalest(arr);
            res[i] = smalest;
        }

        return res;
    }

    /**
     * Поиск наименьшего значения
     * */
    public static int findSmalest(int[] arr) {
        int smalest = arr[0];
        int indexSmalest = 0;

        for(int i=1; i<arr.length; i++){
            if(smalest > arr[i]){
                smalest = arr[i];
                indexSmalest = i;
            }
        }

        arr[indexSmalest] = Integer.MAX_VALUE;
        return smalest;
    }

    public static int[] sort2(int[] arr){

        for(int i = 0; i < arr.length-1; i++){
            int min = i;

            for(int j = i+1;j< arr.length;j++){
                if(arr[min] > arr[j]) min = j;
            }

            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
        }
        return arr;
    }
}
