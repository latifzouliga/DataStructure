import java.util.Arrays;
import java.util.function.Consumer;

public class MyArrayList<T> {

    private int size;
    private Object[] array;

    public MyArrayList() {
        this.array = new Object[10];
    }

    public int size(){
        return this.size;
    }

    public void add(T element) {
        this.array[this.size++] = element;
        if (this.array.length / 2 <= size) {
            this.array = Arrays.copyOfRange(this.array, 0, this.size + 10);
        }
    }


    public void remove() {
        this.array[size--] = null;
    }

    public void forEach(Consumer<T> consumer) {
        for (int i = 0; i < this.size; i++) {
            T each = (T) this.array[i];
            consumer.accept(each);
        }
    }

    public int indexOf(T t){
        for (int i = 0; i < this.size; i++) {
            if (this.array[i].equals(t)) return i;
        }
        return -1;
    }


    @Override
    public String toString() {
        return Arrays.toString(
                Arrays.stream(this.array)
                        .limit(this.size)
                        .toArray());
    }

    public static void main(String[] args) {

        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("this");
        list.add("Java");
        System.out.println(list);

        MyArrayList<Integer> nums = new MyArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(20);
        nums.remove();
        System.out.println(Arrays.toString(nums.array));

        //System.out.println(nums);

        //nums.forEach(System.out::println);
        nums.forEach(n -> {
            System.out.println(n * 3);
        });

        System.out.println("indexOf = " + list.indexOf("Java"));


    }
}
