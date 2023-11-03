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

        System.out.println("Node1 ID is: "+ node1.id + " and node1 address is: "+ node1.next);
        System.out.println("Node2 ID is: "+ node2.id + " and node2 address is: "+ node2.next);
        System.out.println("Node3 ID is: "+ node3.id + " and node3 address is: "+ node3.next);
        System.out.println("Node4 ID is: "+ node4.id + " and node4 address is: "+ node4.next);

        System.out.println("Iterate through linkedList");

        Node current = node1; // node one is the head
        while (current != null){
            System.out.println(current.id);
            current = current.next;
        }

    }
}
