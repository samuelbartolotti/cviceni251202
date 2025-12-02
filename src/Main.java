import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        MyLinkedList list = new MyLinkedList();
        list.addToEnd(new SpaceShip("A","a"));
        list.addToEnd(new SpaceShip("B","b"));
        list.addToEnd(new SpaceShip("C","c"));

        System.out.println("pepa");
        System.out.println(list);

        for (Node n : list){
            System.out.println(n);
        }

        ArrayList<String> i = new ArrayList<>();
        i.add("A");
        i.add("A");
        i.add("A");
        i.add("A");
        i.add("A");
        Iterator<String> it = i.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}