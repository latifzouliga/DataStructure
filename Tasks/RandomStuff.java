import java.util.Arrays;


public class RandomStuff {


    public static void main(String[] args) {
        int[] arr = {9, 7, 12, 4, 3};
        int[] arr2 = {1, 2, 3, 4, 7, 9, 11, 12, 13, 14, 15, 16};


        sort(arr);
        System.out.println(Arrays.toString(arr));


    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int toInsert = array[i];
            int k = i - 1;
            while (k >= 0 && array[k] > toInsert) {
                array[k + 1] = array[k];
                k--;
            }
            array[k + 1] = toInsert;
        }

    }


    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }


}






