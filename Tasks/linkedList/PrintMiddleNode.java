package linkedList;

public class PrintMiddleNode {


    public static void printMiddleNode(SLL.Node head) {
        SLL.Node slowP = head;
        SLL.Node fastP = head;
        SLL.Node prev = null;

        // if we don't know the tail
        while (fastP != null && fastP.next != null) {

            prev = slowP;
            slowP = slowP.next;
            fastP = fastP.next.next;
        }

        if (fastP == null) {
            System.out.println(prev.value + " " + slowP.value);
            return;
        }
        System.out.println(slowP.value);
    }


    // if we know the tail
    public static void printMiddleNode2(SLL.Node head, SLL.Node tail) {

        SLL.Node slowP = head;
        SLL.Node fastP = head;

        // if we don't know the tail
        while (fastP != tail && fastP.next != tail) {
            slowP = slowP.next;
            fastP = fastP.next.next;
        }

        if (fastP == tail) {
            System.out.println(slowP.value);
            return;
        }
        System.out.println(slowP.value +" "+ slowP.next.value);
    }

    public static void main(String[] args) {


        SLL sll = new SLL();

        for (int i = 1; i <= 4; i++) {
            sll.insert(i);
        }


        printMiddleNode(sll.head);
        printMiddleNode2(sll.head, sll.tail);
    }

}
