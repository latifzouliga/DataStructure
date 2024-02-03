package review_2;

class GLinkedList<T> {

    Node<T> head;
    Node<T> tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }

    void addFirst(T value){
        Node<T> node = new Node<>(value);
        if (isEmpty()){
            head = tail = node;
        }
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    T removeFirst(){
        if (isEmpty()){
            return null;
        }

        T result = null;
        if (head == tail){
            result = head.value;
            head = tail = null;
        }
        else {
            result = head.value;
            head = head.next;
        }
        return result;
    }

    void print(){
        Node<T> current = head;
        while (current != null){
            System.out.print(current.value + " => ");
            current = current.next;
        }
        System.out.println("null");
    }


}











