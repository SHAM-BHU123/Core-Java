
class myThread extends Thread{
   public myThread(String name){
     super(name);
     setPriority(Thread.MAX_PRIORITY);
   }
}



public class Threadexample{
    public static void main(String[] args) {
        myThread t= new myThread("I am thread 1");
        System.out.println("ID of a thread is "+t.getId());
        System.out.println("Name of a thread is "+t.getName());
        System.out.println("Priority of the thread is "+t.getPriority());
        System.out.println(t.isAlive());
        t.start();
        System.out.println("State of the thread is "+t.getState());
        System.out.println("Group of the thread is "+t.getThreadGroup());

    }
}
