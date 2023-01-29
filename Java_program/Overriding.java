
class Tv{
    void switchOn(){
        System.out.println("old tv switch on");
    }
    void changeChannel(){
        System.out.println("Old tv change channel");
    }
}

class smartTv extends Tv{
    void switchOn(){
        System.out.println("smart tv switch on");
    }
    void changeChannel(){
        System.out.println("Smart tv change channel");
    }
    void browsing(){
        System.out.println("it has extra feature called browsing");

    }

}


public class Overriding {
    public static void main(String[] args) {

        Tv t=new smartTv();
        t.switchOn();
        t.changeChannel();
    }
}
