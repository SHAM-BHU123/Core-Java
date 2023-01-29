public class runableInterfaceSingleClass implements Runnable{
    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"WORLD");
            i++;
        }
    }




    public static void main(String[] args) {
        runableInterfaceSingleClass r =new runableInterfaceSingleClass();
        Thread t=new Thread(r);
        t.start();
        int i = 1;
        while (true) {
            System.out.println(i + "HELLO");
            i++;
        }
    }
}
