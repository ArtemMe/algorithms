package sorting.merge;

public class Merge {
    public static int [] sort(int[] in){
        return sort(in,0, in.length-1);
    }

    public static int [] sort(int[] in, int low, int high) {
        if(high-low == 1) {
            int firstE = in[low];
            int secondE = in[high];

            if(firstE > secondE) return new int[]{secondE,firstE};
            else return new int[]{firstE,secondE};
        }

        if(high - low <= 0) {
            return new int[]{in[low]};
        }

        int point = (high + low)/2;

        int[] first = sort(in, low, point-1);
        int[] second = sort(in, point, high);

        return merge(first, second);
    }

    private static int[] merge(int[] a, int[] b){
        int [] result = new int[a.length+b.length];

        int countA = 0;
        int countB = 0;

        for (int i=0; i < a.length+b.length; i++){

            if(countA == a.length){
                result[i] = b[countB];
                countB++;
            } else if(countB == b.length){
                result[i] = a[countA];
                countA++;
            } else if(a[countA] < b[countB]) {
                result[i] = a[countA];
                countA++;
            } else {
                result[i] = b[countB];
                countB++;
            }
        }

        return result;
    }
}
