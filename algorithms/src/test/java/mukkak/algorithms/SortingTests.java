package mukkak.algorithms;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortingTests {
    @Test
    public void testInsertionSort() {
        Integer[] sorted = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] input1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] input2 = {8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] input3 = {1, 3, 5, 7, 8, 6, 4, 2};

        Sorting.insertionSort(input1);
        Sorting.insertionSort(input2);
        Sorting.insertionSort(input3);

        Assertions.assertArrayEquals(sorted, input1);
        Assertions.assertArrayEquals(sorted, input2);
        Assertions.assertArrayEquals(sorted, input3);
    }
}
