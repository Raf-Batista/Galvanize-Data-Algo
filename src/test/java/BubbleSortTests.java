import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class BubbleSortTests {
    @Test
    @DisplayName("It should sort an array")
    public void bubbleSort_withUnsortedArray() {
        int[] unsorted = new int[] {5,6,2,8,1,9,4};
        int[] sorted = new int[] {1,2,4,5,6,8,9};
        BubbleSort.bubbleSort(unsorted);
        assertArrayEquals(sorted, unsorted);
    }
}
