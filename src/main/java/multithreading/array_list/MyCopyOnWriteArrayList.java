package multithreading.array_list;

import java.util.Arrays;

public class MyCopyOnWriteArrayList<T> {

    private volatile Object[] array = new Object[0];
//в настоящей реализации тут стоят локи на методы
    public void add(int index, T item) {
        if (index < 0) {
            throw new IllegalArgumentException();
        }
        boolean needsModification = index > array.length - 1;

        if (!needsModification) {
            if (item == null) {
                needsModification = array[index] != null;
            } else {
                needsModification = item.equals(array[index]);
            }
        }

        if (needsModification) {
            final Object[] newArray = Arrays.copyOf(array, Math.max(array.length, index + 1));
            newArray[index] = item;
            array = newArray;
        }
    }

    public void remove(int index) {
        if (index < 0 || index >= array.length) {
            throw new IllegalArgumentException();
        }
        int newSize = array.length - 1;
        if (newSize < 0) {
            newSize = 0;
        }
        final T[] newArray = (T[]) new Object[newSize];
        System.arraycopy(array, 0, newArray, 0, index);
        if (index + 1 < newSize) {
            System.arraycopy(array, index + 1, newArray, index, newSize - index);
        }
        array = newArray;
    }

    public T get(int index) {
         return (T)array[index];
    }

    public int size() {
        return array.length;
    }
}