package recursion;

import java.util.Arrays;

public class Spiral {

    public static void main(String[] args) {

        int[][] array =
                {{1, 2, 3, 4,},
                        {12, 13, 14, 5},
                        {11, 16, 15, 6},
                        {10, 9, 8, 7}};

        spiral(array);

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int[][] multi = fillSpiral(arr, new int[4][5]);

        for (int[] ints : multi) {
            System.out.println(Arrays.toString(ints));
        }

    }

    public static void spiral(int[][] array) {
        spiral(array, 0, array.length - 1, array.length - 1, 0);
    }

    public static void spiral(int[][] array, int top, int right, int bottom, int left) {

        if (left > right) {
            return;
        }

        // top row
        for (int i = left; i < right; i++) {
            System.out.println(array[top][i]);
        }

        // right column
        for (int i = top; i < bottom; i++) {
            System.out.println(array[i][right]);
        }

        // bottom row
        for (int i = right; i > left; i--) {
            System.out.println(array[bottom][i]);
        }

        // left column
        for (int i = bottom; i > top; i--) {
            System.out.println(array[i][left]);
        }

        spiral(array, top + 1, right - 1, bottom - 1, left + 1);
    }


    public static int[][] fillSpiral(int[] array, int[][] arrToFill){
        return fillSpiral(array, arrToFill, 0, arrToFill.length , arrToFill.length -1, 0, 0);
    }
    public static int[][] fillSpiral(int[] array, int[][] arr, int top, int right, int bottom, int left, int index) {

        if (left > right) {
            return arr;
        }

        // top row
        for (int i = left; i < right; i++) {
            arr[top][i] = array[index++];
        }

        // right column
        for (int i = top; i < bottom; i++) {
            arr[i][right] = array[index++];
        }

        // bottom row
        for (int i = right; i > left; i--) {
            arr[bottom][i] = array[index++];
        }

        // left column
        for (int i = bottom; i > top; i--) {
            arr[i][left] = array[index++];
        }

        return fillSpiral(array, arr, top + 1, right - 1, bottom - 1, left + 1, index);
    }
}
