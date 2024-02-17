public class JumpSearch {

    public static void main(String[] args) {

        int[] nums = {1, 2, 4, 6, 8, 10, 11, 15, 20, 21, 30, 44, 67, 99};
        System.out.println(jumpSearch(nums,10));


    }

    // it is kinda improvement to binary search
    // it is like linear search but with jumping with a fixed steps and comparing the data with the last element in the jump
    // calculating the block size by taking the square root of the data size
    // if the last element in the block is greater than the data, then we do linear search from the beginning if the block
    // time complexity: O(sqr(n))
    // Space complexity: O(1)
    public static int jumpSearch(int[] array, int data){
        int blockSize = (int) Math.sqrt(array.length);
        int start = 0;
        int next = blockSize;

        while (start < array.length && array[next -1] <  data){
            start = next;
            next += blockSize;
            if (next > array.length){
                next = array.length;
            }
        }

        for (int i = start; i < next; i++) {
            if (array[i] == data){
                return i;
            }
        }

        return -1;
    }
}
