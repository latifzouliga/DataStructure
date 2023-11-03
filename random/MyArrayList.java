import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList {

    int[] array;
    int size;

    public MyArrayList() {
        this.size = 0;
        array = new int[10];

    }

    public void add(int element){
        array[size++] = element;
        if (array.length / 2  <= size){
            array = Arrays.copyOfRange(array,0,size +10);
        }
    }

    public void remove(){
        array[size--] = 0;
    }



    @Override
    public String toString() {
        return Arrays.toString(
                Arrays.stream(array)
                .limit(size)
                .toArray());
    }

    public static void main(String[] args) {

        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(10);
        myArrayList.add(20);
        myArrayList.add(300);
        myArrayList.add(40);
        myArrayList.add(40);
        myArrayList.add(40);
        myArrayList.add(40);
        myArrayList.add(40);
        myArrayList.add(40);
        myArrayList.add(40);
        myArrayList.add(40);
        myArrayList.add(40);
        myArrayList.add(40);
        myArrayList.add(40);
        myArrayList.add(50);
        myArrayList.add(50);
        myArrayList.remove();
        myArrayList.remove();
        myArrayList.remove();
        myArrayList.remove();
        myArrayList.remove();
        myArrayList.remove();
        myArrayList.remove();
        myArrayList.remove();
        myArrayList.remove();
        myArrayList.remove();
        myArrayList.remove();
        myArrayList.remove();

        System.out.println(myArrayList);
        System.out.println(myArrayList.size);
        System.out.println(Arrays.toString(myArrayList.array));


    }
}
