public class SinglyLinkedList {

    Node head;
    Node tail;
    int size;

    boolean isEmpty(){
        return head == null;
    }

    void add(int data){
        Node node = new Node(data);

        if(isEmpty()){
            head = tail = node;
            //head = node;
            //tail = node;
            size++;
        }else { // if there are elements in list
            tail.next = node;
            tail = node;
            size++;
        }
    }

    void printNodes(){
        Node current = head;
        while (current != null){

            if (current.next == null) System.out.println(current.id + " => null");
            else {
                System.out.print(current.id + " => ");
            }
            current = current.next;
        }

    }
}
