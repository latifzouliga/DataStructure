import java.util.NoSuchElementException;
import java.util.function.Consumer;

public class MyQueue<T> {

    private QNode<T> front;
    private QNode<T> back;
    private int size;

    boolean isEmpty() {
        return front == null;
    }

    T peek() {
        return front.value;
    }

    void enqueue(T element) {
        QNode<T> node = new QNode<>(element);

        if (isEmpty()) {
            front = back = node;
        } else {
            back.next = node;
            back = node;
        }
        size++;

    }

    T dequeue() {
        QNode<T> frontNode;
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        // if(size == 1)
        if (front == back) {
            frontNode = front;
            front = back = null;
        } else {
            frontNode = front;
            front = front.next; // new front = front.next
        }
        size--;
        return frontNode.value; // return the old value
    }

    int size() {
        return size;
    }



    void printQueue() {

        QNode<T> current = front;

        System.out.print("[");

        while (current != null) {
            if (isEmpty()) {
                System.out.println("");
            } else {
                System.out.print(current.value);
                if (current.next != null) System.out.print(", ");
            }
            current = current.next;
        }
        System.out.println("]");
    }



    @Override
    public String toString() {

        QNode<T> current = front;
        StringBuilder result = new StringBuilder("[");

        while (current != null) {
            if (!isEmpty()) {
                result.append(current.value);
                if (current.next != null) result.append(", ");
            }
            current = current.next;
        }
        result.append("]");
        return result.toString();
    }
}
