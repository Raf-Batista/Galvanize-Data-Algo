package Algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class QuickSort {
    /*
        Quicksort implemented with ArrayLists

        Runtime O(n log(n)) Average O(n^2) Worstcase.memory O(n log(n))
    */
    public static void quicksort(ArrayList<Integer> array) {
        quicksort(array, 0, array.size() -1);
    }

    public static void quicksort(ArrayList<Integer> array, int left, int right) {
        if (left >= right) return;

        int pivot = array.get((left + right) /2);
        int index = partition(array, left, right, pivot);
        quicksort(array, left, index - 1);
        quicksort(array, index, right);
    }

    public static int partition(ArrayList<Integer> array, int left, int right, int pivot) {
        while (left <= right) {
            while (array.get(left) < pivot) { left++; }
            while (array.get(right) > pivot) { right--; }

            if (left <= right) {
                Collections.swap(array, left, right);
                left++;
                right--;
            }
        }
        return left;
    }
}
