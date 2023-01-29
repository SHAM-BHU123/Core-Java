

public class StringBuffer  {
    public static void main(String[] args) {
        String s=new String("hello");
        StringBuffer s1 =new StringBuffer();
        StringBuilder s2=new StringBuilder("hello");
        s.concat("World");
        s2.append("world");

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

    }
}
