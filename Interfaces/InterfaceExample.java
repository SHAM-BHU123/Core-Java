class phone{
    public void call(){
        System.out.println("calling");
    }
    public void sms(){
        System.out.println("sms");
    }
}
  interface camera {
    void click();
    void record();
}

interface musicplayer{
    void play();
    void pause();
    void stop();
}

class smartphone extends phone implements camera,musicplayer{
    void videocall(){
        System.out.println();
    }
     public void click(){
        System.out.println();
    }
     public   void record(){
        System.out.println();
    }
     public void play(){
         System.out.println();
     }
    public void pause(){
         System.out.println();
     }
    public void stop(){
         System.out.println();
     }

}
public class InterfaceExample {
    public static void main(String[] args) {
smartphone s=new smartphone();
      phone p=s;
      p.call();
      camera c=s;
      musicplayer m=s;
    }
}
