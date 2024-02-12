package review;

import java.util.NoSuchElementException;

public class HeapTree {


    int[] elements;
    int size;

    public HeapTree(int capacity) {
        this.elements = new int[capacity];
        this.size = 0;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void insert(int value) {
        if (size == elements.length) {
            throw new ArrayStoreException();
        }
        elements[size++] = value;
        bubbleUp();
    }

    int remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        int toRemove = elements[0];
        elements[0] = elements[--size];
        elements[size] = 0;
        bubbleDown();
        return toRemove;
    }

    int leftIndex(int index) {
        return index * 2 + 1;
    }

    int rightIndex(int index) {
        return index * 2 + 2;
    }

    int parentIndex(int index) {
        return (index - 1) / 2;
    }

    boolean hasLeft(int index) {
        return leftIndex(index) < size;
    }

    boolean hasRight(int index) {
        return rightIndex(index) < size;
    }


    int maxChild(int index) {

        if (!hasLeft(index)) {
            return index;
        } else if (!hasRight(index)) {
            return leftIndex(index);
        } else {
            int left = leftIndex(index);
            int right = rightIndex(index);
            return elements[left] > elements[right] ? left : right;
        }

    }


    void bubbleUp() {
        int index = size - 1;
        while (index >= 0 && elements[index] > elements[parentIndex(index)]) {
            swap(index, parentIndex(index));
            index = parentIndex(index);
        }
    }



    void bubbleDown() {
        int index = 0;
        while (index <= size && elements[index] < elements[maxChild(index)]) {
            swap(index, maxChild(index));
            index = maxChild(index);
        }
    }

    void swap(int x, int y) {
        int temp = elements[x];
        elements[x] = elements[y];
        elements[y] = temp;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

}












