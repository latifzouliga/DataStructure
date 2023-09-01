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
        while (index > 0 && items[index] > items[parentIndex(index)]) {
            swap(index, parentIndex(index));
            // assign index with the parent index
            index = parentIndex(index); // similar to current = current.next

        }
    }

    public int parentIndex(int index) {
        return (index - 1) / 2;
    }

    public void swap(int first, int second){
        int temp=items[first];
        items[first]=items[second];
        items[second]=temp;
    }

    public void printHeap() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(items[i] );
        }
        System.out.println(list);
    }


}












