package main.java;

public class MyArrayListTest {

    public static void main(String[] args) {

       MyArrayList myArrayList = new MyArrayList(5);

       myArrayList.add(1);
       myArrayList.add(2);
       myArrayList.add(3);
       myArrayList.add(4);
       myArrayList.add(5);
       myArrayList.add(6);
       myArrayList.add(6);
       myArrayList.add(6);
       myArrayList.add(6);
       myArrayList.add(6);

        System.out.println(myArrayList.numbers.length);
        System.out.println(myArrayList.size);

    }
}
