class  Mydata{
    int i;
   synchronized public void  display(String str){
        for (i=0;i<str.length();i++){
            System.out.println(str.charAt(i));

        }
       try {
           Thread.sleep(1000);
       }
       catch (Exception e){
           System.out.println(e);
       }
    }

}

class Thread1 extends  Thread{
    Mydata d;

    public  Thread1(Mydata d){
        this.d=d;
    }

    public void run(){
        d.display("hello world");
    }

}


class Thread2 extends  Thread{
    Mydata d;

    public  Thread2(Mydata d){
        this.d=d;
    }

    public void run(){
        d.display("welcome all");
    }

}




public class SynExample {
    public static void main(String[] args) {
        Mydata data=new Mydata();

        Thread1 t1=new Thread1(data);
        Thread2 t2=new Thread2(data);


        t1.start();
        t2.start();
    }

}
