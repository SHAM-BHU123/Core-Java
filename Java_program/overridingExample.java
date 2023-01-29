class car{
    void start(){
        System.out.println("Car is started");
    }

    void accelerate(){
        System.out.println("Car is accelerate");
    }

    void changeGear(){
        System.out.println("Gare is changed");
    }
}
class luxaryCar extends car{
    void changeGear(){
        System.out.println("Gare is automatically changed");
    }
    void openRoof(){
        System.out.println("Roof is open");
    }
}

public class overridingExample {
    public static void main(String[] args) {
//    luxaryCar lu= new luxaryCar();
//    car C=new car();
//        System.out.println("****This is come from a child class****");
//    lu.changeGear();
//    lu.openRoof();
//
//        System.out.println("****This is come from a parent class****");
//
//        C.start();
//        C.accelerate();
//        C.changeGear();

        car c=new luxaryCar();
        c.start();
        c.accelerate();
        c.changeGear();


    }
}
