public class LinkedListDemo {

    public static void main(String[] args) {


        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);

        // creating a link between the nodes
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        System.out.println("Node1 ID is: "+ node1.value + " and node1 address is: "+ node1.next);
        System.out.println("Node2 ID is: "+ node2.value + " and node2 address is: "+ node2.next);
        System.out.println("Node3 ID is: "+ node3.value + " and node3 address is: "+ node3.next);
        System.out.println("Node4 ID is: "+ node4.value + " and node4 address is: "+ node4.next);

        System.out.println("Iterate through linkedList");

        Node current = node1; // node one is the head
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }

    }
}
