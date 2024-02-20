import java.util.LinkedList;
import java.util.List;

public class MyHashMap {

    public List<Buckets> hashMap;

    public int modNumber;

    public MyHashMap() {
        this.hashMap =  new LinkedList<>();
        this.modNumber = 2341;
        for (int i = 0; i < 2341; i++) {
            this.hashMap.add(new Buckets());
        }
    }

    public void put(int key, int value) {
        // calculate index
        int hashCode = key % modNumber;
        this.hashMap.get(hashCode).update(key, value);

        // call method update() from linkedList
    }

    public int get(int key) {
        // calculate index
        int hashCode = key % modNumber;
        return this.hashMap.get(hashCode).get(key);
    }

    public void remove(int key) {
        int hashCode = key % modNumber;
        this.hashMap.get(hashCode).remove(key);
    }

    public void print(){
        System.out.print("{");
        for (Buckets each : hashMap){
            for (KeyValue<Integer, Integer> keyValue : each.bucketList) {
                System.out.print(keyValue.key + "="+ keyValue.value+", ");
            }
        }
        System.out.println("}");
    }

    public void print2(){

        for (Buckets each : hashMap){
            for (KeyValue<Integer, Integer> keyValue : each.bucketList) {
                System.out.print(keyValue.key + "="+ keyValue.value+", ");
            }
        }
        System.out.println("}");
    }
}
