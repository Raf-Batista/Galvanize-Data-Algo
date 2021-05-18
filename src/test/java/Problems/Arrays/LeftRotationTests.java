package Problems.Arrays;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class LeftRotationTests {

    @Test
    @DisplayName("It should rotate the array twice")
    public void rotateLeft_twice() {
        int [] expected = new int[] {3,4,5,1,2};
        int[] actual = LeftRotation.rotateLeft(new int[] {1,2,3,4,5}, 2);

        assertArrayEquals(expected, actual);
    }
}
