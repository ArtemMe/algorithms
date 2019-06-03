package binary_search;

public class BinarySearch {
    public static int find(int number, int[] mass){
        return findElement(number, mass,0, mass.length-1);
    }

    private static int findElement(int number, int[] mass, int startIndex, int endIndex){
        if(endIndex - startIndex <= 1) {
            if(mass[endIndex] == number) return endIndex;
            else if(mass[startIndex] == number) return startIndex;
            else return 0;
        }

        int halfI = ((endIndex - startIndex)/2)+startIndex;
        int halfE = mass[halfI];

        if(number == halfE) return halfI;

        if(number > halfE){
            return findElement(number, mass, halfI, endIndex);
        } else {
            return findElement(number, mass, startIndex, halfI);
        }
    }
}
