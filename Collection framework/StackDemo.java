import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack s=new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();
        s.pop();
        s.peek();
        System.out.println(s.isEmpty());
        System.out.println(s);
    }
}
