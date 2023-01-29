class Outer{
    int x=10;
    class inner{
        int y=20;
        void innerDisplay(){
            System.out.println(x);
            System.out.println(y);
        }
    }

    void outerDisplay(){
        inner i=new inner();
        i.innerDisplay();
        System.out.println(i.y);
    }
}


public class Test {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.outerDisplay();
        Outer.inner i=new Outer().new inner();
    }
}
