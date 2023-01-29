import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("shambhu");
        l.add("sapana");
        l.add(10);
        l.add(null);
        l.set(0,"sapana");
        l.add(0,"hardware");
        l.removeLast();
        l.addFirst("Rabins");
        System.out.println(l);
    }
}
