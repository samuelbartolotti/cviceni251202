import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedListEveryEven implements Iterator<Node> {

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

    public MyLinkedListEveryEven(Node current) {
        this.current = current;
    }
}
