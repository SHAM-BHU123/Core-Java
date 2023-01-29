class MYdata{
    int value;
     public void set(int v){
         value=v;
     }

     public int get(){
         int x=0;
         x=value;
         return x;
     }

}

class Producer extends Thread{
    Mydata data;
    public Producer(Mydata d){
       data=d;
    }

    public void run(){
        int count=1;
        while (true){
            data.set(count);
            System.out.println("producer"+count);
            count++;
        }
    }
}


class Consumer extends Thread{
    Mydata data;
    public Consumer(Mydata d){
        data=d;
    }

    public void run(){
        int value;
        while (true){
            value=data.get();
            System.out.println("Consumer"+value);
        }
    }
}



public class Interprocess {
    public static void main(String[] args) {
        MYdata data=new MYdata();
        Producer p=new Producer(data);
        Consumer c=new Consumer(data);
        p.start();
        c.start();

    }
}
