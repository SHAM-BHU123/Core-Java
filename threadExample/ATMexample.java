class ATM{
  synchronized   public void checkbalance(String name){
        System.out.println(name +"checking");
        try {
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Balanced");
    }

    synchronized public void withdraw(String name,int amount){
        System.out.println(name +"withdrawing");
        try{
            Thread.sleep(1000);
        }
        catch (Exception e){
            System.out.println("Amount");
        }
    }
}

class Customer extends Thread{
    ATM atm;
    String name;
    int amount;

    public void Customer(String s,ATM a,int amt){
       name=s;
       atm=a;
       amount=amt;
    }

    public void useAtm(){
        atm.checkbalance(name);
        atm.withdraw(name,amount);
    }

    public void run(){
        useAtm();
    }
}



public class ATMexample  {
    public static void main(String[] args) {
        ATM atm=new ATM();
        Customer c1=new Customer("shambhu",atm,100);
        Customer c2=new Customer("sapana",atm,200);
        c1.start();;
        c2.start();

    }
}
