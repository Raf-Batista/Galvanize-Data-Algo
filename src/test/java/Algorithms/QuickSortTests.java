package Algorithms;

import Algorithms.QuickSort;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class QuickSortTests {

    @Test
    @DisplayName("It should return a sorted array")
    public void quickSort_withUnsortedArrayOfInt() {
        ArrayList<Integer> unsortedArray = new ArrayList<>();
        unsortedArray.add(6);
        unsortedArray.add(1);
        unsortedArray.add(8);
        unsortedArray.add(22);
        unsortedArray.add(3);

        ArrayList<Integer> sortedArray = new ArrayList<>();
        sortedArray.add(1);
        sortedArray.add(3);
        sortedArray.add(6);
        sortedArray.add(8);
        sortedArray.add(22);

        QuickSort.quicksort(unsortedArray, 0, 4);

        assertEquals(sortedArray, unsortedArray);
    }
}
