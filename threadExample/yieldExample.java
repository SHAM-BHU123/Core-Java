class yieldThread extends Thread {

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++ +"shambhu");

        }
    }
}

public class yieldExample{
    public static void main(String[] args) throws Exception{
        okThread m =new okThread();
        m.start();
        int i = 1;
        while (true) {
            System.out.println(i++ +"main");

        }

    }
}

