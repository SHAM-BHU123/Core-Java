abstract class Super{
void Super(){
    System.out.println("I am from super class");
}

void return1(){
    System.out.println("I am from Super method1");
}

abstract void return2();

}

class sub extends Super{
    void return2(){
        System.out.println("subreturn2");
    }
}


public class test {
    public static void main(String[] args) {
   Super s=new sub();
   s.return1();
   s.return2();
   s.Super();

    }
}
