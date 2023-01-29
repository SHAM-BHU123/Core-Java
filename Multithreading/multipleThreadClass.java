class myThread extends Thread
{
    public void run(){
        int i=1;
        while (true){
            System.out.println(i+"world");
            i++;
        }

    }
}



public class multipleThreadClass{
    public static void main(String[] args) {
        myThread t=new myThread();
        t.start();
        int i=1;
        while (true){
            System.out.println(i+"hello");
            i++;
        }
    }
}
