import java.util.HashSet;

public class HashedMapDemo {
    public static void main(String[] args) {
        HashSet h=new HashSet();
        h.add(12);
        h.add(1);
        h.add(10);

        h.add("sapana");
        h.add("shambhu");
        System.out.println(h.add("sapana"));
        System.out.println(h);
    }
}
