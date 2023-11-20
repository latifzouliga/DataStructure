public class TestSinglyLinkedList {


    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();

        myList.add(12);
        myList.add(14);
        myList.add(16);
        myList.add(20);
        myList.add(21);
        myList.add(22);
//        System.out.println(myList);
//        System.out.println(myList.size);
//        System.out.println(myList.head);
//        System.out.println(myList.tail);
//        System.out.println(myList.head.id);
//        System.out.println(myList.tail.id);

        //System.out.println(myList.isEmpty());

        //myList.printNodes();
        System.out.println("Begin forEach");
        myList.forEach(System.out::println);
        System.out.println("End forEach");

        // test deleteNodeById method
        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 1; i < 10; i++) {
            list.add(i * 10);
        }

        list.printNodes();

        System.out.println("\n");
        System.out.println("--------- Find the index of an element -----");

        System.out.println("index of 10 = " + list.indexOf(10));  // 0
        System.out.println("index of 50 = " + list.indexOf(50));  // 4
        System.out.println("index of 90 = " + list.indexOf(90));  // 8
        System.out.println("index of 122 = " + list.indexOf(122)); // -1

        System.out.println("\n");
        System.out.println("--------- Find element by there index -----");

        System.out.println("list.findByIndex(0) = " + list.findByIndex(0));  // 10
        System.out.println("list.findByIndex(2) = " + list.findByIndex(2));  // 30
        System.out.println("list.findByIndex(4) = " + list.findByIndex(4));  // 50
        System.out.println("list.findByIndex(8) = " + list.findByIndex(8));  // 90

        System.out.println("\n");
        list.printNodes();

        System.out.println("delete element 10");
        list.deleteNodeById(10); // delete element in the beginning of the list
        list.printNodes();

        System.out.println("delete element 50");
        list.deleteNodeById(50); // delete element in the middle of the list
        list.printNodes();

        System.out.println("delete element 90");
        list.deleteNodeById(90); // delete element in the end of the list
        list.printNodes();

        System.out.println("\n");
        System.out.println("Add an element to the beginning of the list");
        list.addFirst(100);
        list.addFirst(999);
        list.printNodes();

        System.out.println("\n");
        System.out.println("Add an element to the end of the list");
        list.addLast(-22);
        list.addLast(7);
        list.printNodes();

        System.out.println("\n");
        System.out.println("list size = " + list.size);

        System.out.println("\n");
        System.out.println("------- test  an empty list ----------");
        SinglyLinkedList emptyList = new SinglyLinkedList();
        emptyList.printNodes();

        emptyList.deleteNodeById(1000);

        System.out.println(list.indexOf(40));

        list.printNodes();
        System.out.println(list.size);
        System.out.println("get Kth element from the last = " + list.getKthFromLast(6));


        list.removeKthNode(2);
        list.printNodes();
        System.out.println(list.size);




    }
}



















