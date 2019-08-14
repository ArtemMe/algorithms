package bublesort;

public class Buble {
    public static void sort(int[] in){
        for(int i = 0; i<in.length-1; i++){
            for(int j = 0; j<in.length-1-i; j++) {
                int first = in[j];
                int second = in[j + 1];

                if (first > second) {
                    in[j + 1] = first;
                    in[j] = second;
                }
            }
        }

    }
}
