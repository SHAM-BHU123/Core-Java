class Super {
    void meth1(){
        System.out.println("meth 1");
    }
    void meth2(){
        System.out.println("meth 2");
    }

}
class SUB extends Super{
    void meth2(){
        System.out.println("sUb meth");
    }

    void meth3(){
        System.out.println("meth 3");
    }
}

 public class methoddispatch {
    public static void main(String[] args) {
        Super s=new SUB();
        s.meth1();
        s.meth2();
    }

}
