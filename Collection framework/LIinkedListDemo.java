import java.util.LinkedList;
import java.util.ListIterator;

public class LIinkedListDemo {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add("sapana");
        ll.add("shambhu");
        ll.add("Bindu");
        ll.add("sunita");
        ll.add("Rishiram");
        ll.add("putala");
        System.out.println(ll);
        ListIterator ltr=ll.listIterator();
        while(ltr.hasNext()){
            String s=(String) ltr.next();
            if(s.equals("sapana"))
                ltr.remove();
            else
                ltr.set("Indu");


        }
        System.out.println(ll);
    }
}
