package Problems.Arrays;

/*
https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays

A left rotation operation on an array shifts each of the array's elements 1 unit to the left. For example,
if 2 left rotations are performed on array [1,2,3,4,5] then the array would become [3,4,5,1,2] . Note that the lowest index
item moves to the highest index in a rotation. This is called a circular array.

*/

public class LeftRotation {
    static int[] rotateLeft(int[] array, int digit) {
        int[] result = new int[array.length];
        int counter = 0;

        for(int i = digit; i < array.length; i++)
        {
            result[counter] = array[i];
            counter += 1;
        }

        for(int i = 0; i < digit; i++)
        {
            result[counter] = array[i];
            counter += 1;
        }

        return result;
    }
}
