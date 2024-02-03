package review_2;

class GStack<T>{
    GLinkedList<T> list = new GLinkedList<>();

    boolean isEmpty(){
        return list.isEmpty();
    }

    void push(T t){
        list.addFirst(t);
    }

    T pop(){
        return list.removeFirst();
    }

    T peek(){
        if (isEmpty()){
            return null;
        }
        return list.head.value;
    }

    int size(){
        return list.size;
    }
}

// Adapter pattern - Design pattern by GOF