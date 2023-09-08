public class LinearSearch {

    // Linear search start searching for an element from the beginning of the array until the end if it can't find it
    // time complexity is O(n)
    // space complexity is O(1)
    public static int linearSearch(int[] array, int data){

        for (int i = 0; i < array.length; i++) {
            if (array[i] == data){
                return i;
            }
        }
        return -1;
    }
}
