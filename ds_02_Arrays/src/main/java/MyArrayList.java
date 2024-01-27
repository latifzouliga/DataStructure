package main.java;

import java.util.Arrays;

public class MyArrayList {

    int[] numbers;
    int size;

    public MyArrayList() {
        this.numbers = new int[10];
        this.size = 0;
    }

    public MyArrayList(int capacity) {
        this.numbers = new int[capacity];
        this.size = 0;
    }

    int size(){
        return this.size;
    }

    void add(int value){
        if (size >= numbers.length * 0.75){
            grow();
        }
        numbers[size++] = value;
    }

    void grow(){
        /*
        int[] newArray = new int[numbers.length * 2];
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        numbers = newArray;
        return numbers;
         */

       numbers = Arrays.copyOf(numbers,numbers.length * 2);
    }

}
