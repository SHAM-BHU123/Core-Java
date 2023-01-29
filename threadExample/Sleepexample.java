class iThread extends Thread {
    public iThread(String name) {
        super(name);
    }

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++);
            try {
                Thread.sleep(100 );
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}



public class Sleepexample {
    public static void main(String[] args) {
        iThread i=new iThread("This is my thread");
        i.start();
        i.interrupt();
    }
}