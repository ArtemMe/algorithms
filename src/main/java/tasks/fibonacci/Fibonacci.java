package tasks.fibonacci;

public class Fibonacci {
    public static int calculate(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calculate(n-1)+calculate(n-2);
        }
    }

    public static int calculateDinamic(int n) {
        int[] result = new int[n];
        result[0] = 1;
        result[1] = 1;
        for(int i=2;i<n;i++) result[i] = result[i-1] + result[i-2];
        return result[n-1];
    }

    public static void main(String[] args) {
        System.out.println(calculate(4));
        System.out.println(calculateDinamic(4));
    }
}
