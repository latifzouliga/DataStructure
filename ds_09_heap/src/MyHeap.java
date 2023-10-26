import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;

public class MyHeap {

    int[] items;
    int size;

    public MyHeap(int capacity) {
        this.items = new int[capacity];
        this.size = 0;
    }

    // the peek is always in index 0
    public int peek() {
        if (size == 0) throw new NoSuchElementException();
        return items[0];
    }

    public void insert(int value) {
        if (size == items.length) throw new IllegalStateException();
        else {
            // inserting the element to the last index which is th size and increase the size
            items[size++] = value;
            bubbleUp();
        }
    }

    public void bubbleUp() {
        // calculate starting point (starting index)
        int index = size - 1;
        while (index >= 0 && items[index] > items[parentIndex(index)]) {
            swap(index, parentIndex(index));
            // assign index with the parent index
            index = parentIndex(index); // similar to current = current.next

        }
    }

    public int remove() {
        if (size == 0) throw new NoSuchElementException();
        else {
            int result = items[0];
            items[0] = items[--size];
            bubbleDown();
            return result;
        }
    }


    //boolean isValid = ;
    public void bubbleDown() {
        int index = 0;
        int largerChildIndex;
        while (index <= size && !isValidParent(index)) {
            largerChildIndex = largerChildIndex(index);
            swap(index, largerChildIndex);

            index = largerChildIndex;
            bubbleUp();
        }
    }

    public boolean isValidParent(int index) {
        if (!hasLeftChild(index)) return true;
        else {
            boolean isValid = false;
            if (hasRightChild(index)) {
                isValid = (items[index] >= items[leftChildIndex(index)] && items[index] >= items[rightChildIndex(index)]);
            }
            return isValid;
        }
    }

    public boolean hasLeftChild(int index) {
        return leftChildIndex(index) < size;
    }

    public boolean hasRightChild(int index) {
        return rightChildIndex(index) < size;
    }

    public int parentIndex(int index) {
        return (index - 1) / 2;
    }

    public int leftChildIndex(int index) {
        return index * 2 + 1;
    }

    public int rightChildIndex(int index) {
        return index * 2 + 2;
    }

    public int largerChildIndex(int index) {
        if (!hasLeftChild(index)) return index;
        else if (!hasRightChild(index)) {
            return leftChildIndex(index);
        }else {
            return items[leftChildIndex(index)] > items[rightChildIndex(index)] ? leftChildIndex(index) : rightChildIndex(index);
        }

    }

    public void swap(int first, int second) {
        int temp = items[first];
        items[first] = items[second];
        items[second] = temp;
    }

    public void printHeap() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(items[i]);
        }
        System.out.println(list);
    }

    public int[] sort(){
        int[] sorted = new int[size];
        int length = size;
        for (int i = 0; i < length; i++) {
            sorted[i] = remove();

        }
        return sorted;
    }

    //================================ tasks =============================

    // find the Kth largest element


    public int largestKthElement(int Kth){

        int removed = 0;
        for (int i = 0; i < Kth -1; i++) {
            removed = remove();
            if (removed == remove()) i--;
        }
        return items[0];
    }






}












