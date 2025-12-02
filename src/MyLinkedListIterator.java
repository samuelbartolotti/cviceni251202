import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedListIterator implements Iterator<Node> {

    private Node current;

    @Override
    public boolean hasNext() {
        return current != null;
    }

    @Override
    public Node next() {
        if (!hasNext()){
            throw  new NoSuchElementException("UFJ");
        }
        Node tmp = current;
        current=current.getNext();
        return tmp;
    }

    public MyLinkedListIterator(Node current) {
        this.current = current;
    }
}
