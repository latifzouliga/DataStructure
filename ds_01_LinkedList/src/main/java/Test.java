public class Test {


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

        myList.printNodes();

        // test deleteNodeById method

        SinglyLinkedList list = new SinglyLinkedList();
        for (int i = 1; i < 10; i++) {
            list.add(i * 10);
        }

        list.printNodes();

        list.deleteNodeById(10); // delete element in the beginning of the list
        list.printNodes();

        list.deleteNodeById(50); // delete element in the middle of the list
        list.printNodes();

        list.deleteNodeById(90); // delete element in the end of the list
        list.printNodes();

    }
}



















