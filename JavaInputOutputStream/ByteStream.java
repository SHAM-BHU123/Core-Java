import java.io.ByteArrayInputStream;

public class ByteStream {
    public static void main(String[] args) {
        byte b[]={'a','b','c','d','e','f','i','j'};

        ByteArrayInputStream bis=new ByteArrayInputStream(b);
        String str=new String(bis.readAllBytes());
        System.out.println(str);

        int x;
        while ((x= bis.read())!=-1){
            System.out.println((char)x);
        }
    }
}
