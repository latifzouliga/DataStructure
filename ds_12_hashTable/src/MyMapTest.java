
import java.util.Random;

public class MyMapTest {

    public static void main(String[] args) {

        MyHashMap hashMap = new MyHashMap();

        hashMap.put(1,20);
        hashMap.put(2,20);
        hashMap.put(3,20);

        System.out.println(hashMap.get(3));

        hashMap.put(6, 100);
        System.out.println(hashMap.get(6));

        //hashMap.remove(1);
        System.out.println(hashMap.get(1));

        System.out.println("==========");
        hashMap.print();

        System.out.println("============");

        MyHashMap map = new MyHashMap();
        Random random = new Random();

        for (int i = 0; i < 1000; i++) {
            map.put(random.nextInt(500),random.nextInt(2000));
        }

        map.print();
        //map.print2();
    }
}
