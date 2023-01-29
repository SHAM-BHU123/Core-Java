import java.io.FileInputStream;

public class filereadingExample {
    public static void main(String[] args) {


        try {
            FileInputStream fos = new FileInputStream("C:/Users/SAM BHU/Desktop/SQL/file.txt");

             byte b[]=new byte[fos.available()];
             fos.read(b);
             String str=new String(b);
            System.out.println(str);


        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
