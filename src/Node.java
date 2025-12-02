public class Node {
    private SpaceShip spaceShip;
    private Node next;
    private Node prev;

    public Node(SpaceShip spaceShip) {
        this.spaceShip = spaceShip;
        this.next = null;
        this.prev = null;
    }

    public void setNext(Node newNode) {
        this.next = newNode;
    }

    public void setPrev(Node newNode) {
        this.prev = newNode;
    }

    public String getValue() {
        return spaceShip.toString();
    }

    @Override
    public String toString() {
        return spaceShip.toString();
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }
}
