class IsThread extends Thread {

    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i++);

        }
    }
}



public class threadjoinyield  {
    public static void main(String[] args) throws Exception{
        okThread m =new okThread();
        m.setDaemon(true);
        m.start();

        try {
            Thread.sleep(10);
        }
        catch (Exception e){

            System.out.println(e);

        }
    }
}