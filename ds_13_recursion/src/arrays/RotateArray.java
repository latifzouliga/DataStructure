package arrays;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(rotateArray(array, 0, 1)));
    }

    public static int[] rotateArray(int[] array, int index, int position) {

        if (index >= position) {
            return array;
        }
        int temp = array[0];
        for (int i = 0; i < array.length-1; i++) {
            array[i] = array[i+1];
        }

        array[array.length - 1] = temp;
        return rotateArray(array, index + 1, position);
    }



}
