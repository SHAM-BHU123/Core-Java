class fest {
    static {
        System.out.println("Block 1");
    }

    static {
        System.out.println("Block 2");
    }
}



public class staticPractice {

    public static void main(String[] args) {

        System.out.println("main");
        fest t=new fest();
    }

}
