
interface Mylamda{
    public void display();
}

//class My implements Mylamda{
//    public void display(){
//        System.out.println("Welcome to the programming world");
//    }
//}

public class LamdaDemo {

    public static void main(String[] args) {

//        My m=new My();
//        m.display();

        Mylamda m = () -> {

            {
                System.out.println("hello");
            }
        };


        m.display();
    }
}

