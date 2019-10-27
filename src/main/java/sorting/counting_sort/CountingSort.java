package sorting.counting_sort;

/***/

public class CountingSort {
    public static int[] sort(int [] arr, int minNum, int maxNum) {
        int[] counterArray = new int[minNum - maxNum];

        for(int i=0; i< arr.length;i++) {
            int num = arr[i];
            int counter = counterArray[num];
            counterArray[num] = ++counter;
        }

        int[] resultArray = new int[arr.length];
        int offset = 0;

        for(int j=0; j < counterArray.length; j++) {
            int count = counterArray[j];

            for(; offset < count; offset++) {
                resultArray[offset] = j;
            }
        }
        return resultArray;
    }
}
