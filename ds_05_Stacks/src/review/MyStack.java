package review;

import java.util.NoSuchElementException;

class MyStack<T> {

    Node<T> top;
    Node<T> bottom;
    int size;

    boolean isEmpty(){
        return top == null;
    }

    void push(T value){
        Node<T> node = new Node<>(value);

        if (isEmpty()){
            bottom = top = node;
        }else {
            top.next = node;
            top = node;
        }
        size++;
    }

    T peek(){
        return top.value;
    }

    T pop(){
        if (isEmpty()) throw new NoSuchElementException();
        Node<T> peakNode = top;

        if (bottom == top){
            bottom = top = null;
        }else {
            Node<T> prev = bottom;
            while (prev.next != top){
                prev = prev.next;
            }
            prev.next = null;
            top = prev;

        }
        return peakNode.value;
    }



    private static class Node<T>{

         T value;
        Node<T> next;

        public Node(T value) {
            this.value = value;
        }
    }
}
