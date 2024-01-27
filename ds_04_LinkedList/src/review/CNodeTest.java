package review;

public class CNodeTest {

    public static void main(String[] args) {
        CustomerLinkedList list=new CustomerLinkedList();
        list.insertLast(new CNode("Jack", "Reacher"));
        list.insertLast(new CNode("Carol", "Walker"));
        list.insertLast(new CNode("Susan", "Walker2"));
        list.printNames();
        list.deleteByName("Susan");
        System.out.println();
        list.printNames();

    }
}
