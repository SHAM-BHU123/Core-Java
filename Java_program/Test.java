class Super{
    public void display(){
        System.out.println("Super class display");
    }
}

class Sub extends Super{
    public void display(){
        System.out.println("Sub class display");
    }
}


public class Test {
    public static void main(String[] args) {
       Super su=new Super();
       su.display();
       Sub sb=new Sub();
       sb.display();
    }
}
