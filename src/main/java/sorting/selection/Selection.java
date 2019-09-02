package sorting.selection;

public class Selection {
    public static void sort(int[] in){

        for(int i=0; i<in.length; i++) {
            int min = in[i];
            int minI = i;
            for (int j=i; j<in.length; j++){
                if(min > in[j]) {
                    minI = j;
                }
                if(j == in.length-1) {
                    swap(in, i, minI);
                }
            }
        }
    }

    private static void swap(int[] arr, int first, int second) {
        int tmp = arr[first];
        arr[first] = arr[second];
        arr[second] = tmp;
    }

}
