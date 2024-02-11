package linkedList;

public class ReverseSLL {

    public static void main(String[] args) {

        SLL sll = new SLL();

        for (int i = 0; i < 10; i++) {
            sll.insert(i);
        }

        sll.print();
        reverse(sll);
        sll.print();
    }

    public static void reverse(SLL list) {

        SLL.Node prev = list.head;
        SLL.Node current = list.head.next;

        while (current != null) {
            SLL.Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        list.tail = list.head;
        list.tail.next = null;
        list.head = prev;


    }
}
