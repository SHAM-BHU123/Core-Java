interface test1{
    void meth1();
    void meth2();
        }
class test2 implements test1{
    public void meth1(){
        System.out.println("hellow i am from meth1");
    }
    public void meth2(){
        System.out.println("hellpw i am from meth2");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        test1 T=new test2();
        T.meth1();
        T.meth2();
    }
}
