import java.io.FileOutputStream;

public class FileExample {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:/Users/SAM BHU/Desktop/SQL/file.txt");
            String str="learn java programming";
            fos.write(str.getBytes());
            fos.close();
        }

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
