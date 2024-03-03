package mukkak.algorithms;

public class Sorting {
    public static <T extends Comparable<T>> void insertionSort(T[] values) {
        if (values.length <= 1) {
            return;
        }

        for (int i = 1; i < values.length; i++) {
            T key = values[i];
            int j = i-1;
            while (j >= 0 && values[j].compareTo(key) > 0) {
                values[j+1] = values[j];
                j = j-1;
            }
            values[j+1] = key;
        }
    }
}
