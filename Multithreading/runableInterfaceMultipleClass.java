class MY implements Runnable{
    public void run(){
        int i=1;
        while(true){
            System.out.println(i+"WORLD");
            i++;
        }
    }
}




public class runableInterfaceMultipleClass {

    public static void main(String[] args) {
        MY m=new MY();
        Thread t=new Thread(m);
        t.start();
        int i=1;
        while (true){
            System.out.println(i+"HELLO");
            i++;

        }
    }
}
