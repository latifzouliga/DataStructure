package arrays;

import java.util.ArrayList;
import java.util.List;

public class FindElement {

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 4, 5};

        System.out.println(find(arr, 5, 0));

        System.out.println(findIndex(arr, 1, 0));

        findIndexes(arr, 4, 0);
        System.out.println(indexes);

        System.out.println(findListOfIndexes(arr, 4, 0, new ArrayList<>()));
        System.out.println(findListOfIndexes_2(arr, 4, 0));

    }

    public static boolean find(int[] array, int target, int index) {

        if (index == array.length) {
            return false;
        }
        return target == array[index] || find(array, target, index + 1);
    }

    public static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) {
            return -1;
        }

        if (target != arr[index]) {
            return findIndex(arr, target, index + 1);
        }
        return index;

    }

    // passing values to outside variable
    static List<Integer> indexes = new ArrayList<>();

    public static void findIndexes(int[] array, int target, int index) {
        if (index == array.length) {
            return;
        }
        if (target == array[index]) {
            indexes.add(index);
        }
        findIndexes(array, target, index + 1);

    }

    // passing values to the next method call and returning the values after all method calls are finished
    // only one list object was created and in each method call a new list reference is pointing to the same list object
    public static List<Integer> findListOfIndexes(int[] array, int target, int index, List<Integer> list) {
        if (index == array.length) {
            return list;
        }
        if (target == array[index]) {
            list.add(index);
        }
        return findListOfIndexes(array, target, index + 1, list);
    }

    // in each method call a new List is created
    public static List<Integer> findListOfIndexes_2(int[] array, int target, int index) {

        // at every call a new ArrayList will be created
        List<Integer> list = new ArrayList<>();

        if (index == array.length) {
            return list;
        }

        // this will contain the value of this function call only, and it will not be passed to the future calls
        if (target == array[index]) {
            list.add(index);
        }

        // list.addAll(findListOfIndexes_2(array, target, index + 1));
        List<Integer> valuesFromBellowCalls = findListOfIndexes_2(array, target, index + 1);

        // after all the calls are done, calls will be popped from stack and the return of each call will be added to the above call
        list.addAll(valuesFromBellowCalls);
        return list;
    }


}
