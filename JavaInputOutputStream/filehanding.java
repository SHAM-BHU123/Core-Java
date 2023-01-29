import java.io.File;

public class filehanding {
    public static void main(String[] args) {
        //File f=new File("C:/Users/SAM BHU/Desktop/java.txt","r");
        File f=new File("C:/Users/SAM BHU/Desktop");
//        boolean x=f.canWrite();
//        System.out.println(x);

        System.out.println(f.isDirectory());
        String str[]= f.list();
         for(String s:str){
             System.out.println(s);
             System.out.println(s);
         }
    }
}
