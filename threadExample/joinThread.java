class okThread extends Thread {

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++);

        }
    }
}



public class joinThread{
    public static void main(String[] args) throws Exception{
        okThread m =new okThread();
        m.setDaemon(true);
        m.start();
        Thread mainThread=Thread.currentThread();
        mainThread.join();

    }
}
