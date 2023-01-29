import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferDemo {
    public static void main(String[] args) throws Exception
    {
        FileInputStream fis =new FileInputStream("C:/Users/SAM BHU/Desktop/java.txt");
        BufferedInputStream bis =new BufferedInputStream(fis);
//        int x;
//        while ((x= bis.read())!=-1){
//            System.out.print((char) x);
//        }

        System.out.println("file"+fis.markSupported());
        System.out.println("buffer"+bis.markSupported());
    }
}
