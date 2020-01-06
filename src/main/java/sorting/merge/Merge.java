package sorting.merge;
/**
 * 1. Делим массив на группы. Сначала на половину, потом еще на половину и так далее пока не останется по одному элементу.
 * 2. Один элемент - то отсортированный массив
 * 3. Сливаешь два массива по одному элементу в один отсортированный массив
 * 4. Затем сливаешь отсортированные массивы по два элемета в сортированный массив в 4 элемента.
 *
 * и так далее
 * */
public class Merge {
    public static int [] sort(int[] in){
        return sort(in,0, in.length-1);
    }

    public static int [] sort(int[] in, int low, int high) {
        //Проверка когда у нас два элемента и мы можем их отсортировать
        if(high-low == 1) {
            int firstE = in[low];
            int secondE = in[high];

            if(firstE > secondE) return new int[]{secondE,firstE};
            else return new int[]{firstE,secondE};
        }

        //на случай если остался один элемент для сортировки
        if(high - low <= 0) {
            return new int[]{in[low]};
        }

        //вычисляем точку разделения
        int point = (high + low)/2;

        //делим массивы дальше
        int[] first = sort(in, low, point-1);
        int[] second = sort(in, point, high);

        //соединяем отсортированные массивы в один
        return merge(first, second);
    }

    private static int[] merge(int[] a, int[] b){
        int [] result = new int[a.length+b.length];

        // Отдельные счетчики для массивы
        int countA = 0;
        int countB = 0;

        for (int i=0; i < a.length+b.length; i++){

            // если закончился счетчик для первого массива добиваем результирующий массив из другого массивы
            if(countA == a.length){
                result[i] = b[countB];
                countB++;
            } else if(countB == b.length){ // если закончился второй массив
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
