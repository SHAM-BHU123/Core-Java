import java.util.Comparator;
import java.util.TreeSet;

public class TreeDemo {
    public static void main(String[] args) {
        TreeSet t=new TreeSet(new Mycomparator());
        t.add("shambhu");
        t.add("sapana");
        t.add("samir");
        System.out.println(t);


    }
}

class Mycomparator implements Comparator{
    public int Compare(Object obj1,Object obj2){
        String 
    }

}
