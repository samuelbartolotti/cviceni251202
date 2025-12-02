import java.util.Iterator;

public class MyLinkedList implements Iterable<Node> {
    private Node head;
    private Node tail;

    public MyLinkedList() {
        head = null;
        tail = null;
    }

    void addToEnd(SpaceShip value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
            tail = newNode;
            return;
        }
        tail.setNext(newNode);
        newNode.setPrev(tail);
        tail = newNode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Node current = head;
        while(current != null){
            sb.append(current.toString());
            current=current.getNext();
        }
        sb.append("]");
        return sb.toString();
    }


    @Override
    public Iterator<Node> iterator() {
        return new MyLinkedListIterator(head);
    }
}
