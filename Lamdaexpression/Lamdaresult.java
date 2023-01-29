
interface Mylammda{
    public void display(String s);
}

public class Lamdaresult {
    public static void main(String[] args) {
      Mylammda m1=(s)->{
          System.out.println(s);

          };
         m1.display("This is my first program");
      }
    }
