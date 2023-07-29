public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;

    Node prev;
    Node current;
    int index;

    boolean isEmpty() {
        return head == null;
    }

    void add(int data) {
        // adding data to list
        Node node = new Node(data);

        // creating link and increasing the size
        if (isEmpty()) {
            head = tail = node;
            //head = node;
            //tail = node;
            size++;
        } else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void deleteNodeById(int value) {

        // check if the list is empty
        if (isEmpty()) {
            System.out.println("list is empty");

        }

        // assign  prev and current with head
        prev = head;
        current = head;

        while (current != null) {
            if (current.id == value) {

                // case 1: current is head
                if (current == head) {
                    head = current.next; // moving the head to next node
                    current.next = null; // head will be eligible for garbage collection
                }
                // case 2: current is tail
                else if (current == tail) {
                    tail = prev;
                    prev.next = null; // Ex - Tail will be eligible for garbage collection

                }
                // case 3: current is middle
                else {
                    prev.next = current.next;
                    current.next = null; // current will be eligible for garbage collection
                }

                // after deletion decrease the list size
                size--;

            }
            // iterate
            // move forward on the element of the list until the current is null
            prev = current;
            current = current.next;
        }
    }

    void printNodes() {

        if (size == 0) {
            System.out.println("list is empty");
        }
        current = head;
        while (current != null) {

            if (current.next == null) System.out.println(current.id + " => null");
            else {
                System.out.print(current.id + " => ");
            }
            current = current.next;
        }

    }

    int indexOf(int element){

        if (isEmpty()) return -1;

        current = head;
        index = 0;

        while (current != null){
            if (current.id == element){
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    int findByIndex(int index){

        current = head;
        this.index = 0;

        while (current != null){
            if (this.index == index) return current.id;
            this.index++;
            current = current.next;
        }
        return -1;
    }

}
