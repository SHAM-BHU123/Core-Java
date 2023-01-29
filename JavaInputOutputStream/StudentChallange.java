import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Array;

public class StudentChallange {
    public static void main(String[] args) {



        try {


            FileInputStream fib=new FileInputStream("C:/Users/SAM BHU/Desktop/SQL/file1.txt");
            FileOutputStream fob = new FileOutputStream("C:/Users/SAM BHU/Desktop/SQL/file2.txt");


            int b;
            while ((b=fib.read())!=-1){
                if(b>=65&&b<=122){
                    fob.write(b+32);
                }
                else
                    fob.write(b);
            }
            fob.close();
            fib.close();


        }
        catch (Exception e){
            System.out.println(e);
        }


    }
}
