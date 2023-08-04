public class MyStack<T> {

    private SNode<T> buttom;
    private SNode<T> top;
    public int size;

    public boolean isEmpty(){
        return buttom == null;
    }
    void push(T value){
        SNode<T> node = new SNode<>(value);

        if (isEmpty()){
            buttom = top = node;
        }else {
            top.next = node;
            top = node;
        }

        size++;

    }

    public T peek(){
        return top.value;
    }

    public T pop(){

        if (isEmpty()){
            throw new RuntimeException();
        }

        SNode<T> peekNode;
        // stack has one element
        if (buttom == top){
            peekNode = top;
            top = buttom = null;
        }
        // stack has more than one element
        else {
            peekNode = top;
            SNode<T> prev = buttom;
            while (prev.next != top){
               prev = prev.next;
            }
            prev.next = null;
            top = prev;

        }
        size--;
        return peekNode.value;

    }

    public void printStack(){
        if (isEmpty()){
            System.out.println("[]");
        }else {
            System.out.print("[");
            SNode<T> current = buttom;

            while (current != null){
                System.out.print(current.value + " ," );
                current = current.next;
            }
            System.out.println("null]");
        }
    }

    public void loopMyStack(){
        SNode<T> current = buttom;
        while (current != null){
            System.out.println(current.value);
            current = current.next;
        }
    }
}














