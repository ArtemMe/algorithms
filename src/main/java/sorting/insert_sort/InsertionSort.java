package sorting.insert_sort;

/**
 * Сам алгоритм заключается в том, что элементы исходного массива просматриваются по одному,
 * и каждый новый элемент вставляется в подходящее ему место среди ранее упорядоченных элементов.
 * Место для вставки может выбираться, например, с помощью бинарного поиска,
 * чтобы не приходилось просматривать все уже вставленные ранее элементы.
 *
 * Вычислительная сложность алгоритма O(n²).
 *
 * */

public class InsertionSort {
    public static int[] sort(int [] arr) {
        int[] result = new int[arr.length];
        int sortSize = 0;
        for(int i=0; i< result.length; i++) {

            //Ищем место куда нужно вставить элемент arr[i] в уже отсортированный массив result
            int insertIndex = 0;
            while(insertIndex < sortSize && arr[insertIndex] < arr[i]) {
                insertIndex++;
            }
            //Затем смещаем все значения в массиве вправо что вставить элемент.
            for(int j = sortSize-1; j>=insertIndex; j--) {
                result[j+1] = result[j];
            }
            //Вставляем элемент
            result[insertIndex] = arr[i];
            sortSize++;
        }

        return result;
    }
}
