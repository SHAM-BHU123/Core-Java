import java.io.FileOutputStream;
import java.io.PrintStream;

class student{
    int roll;
    String name;
    String dept;
}

public class printStreamDemo  {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos=new FileOutputStream("C:/Users/SAM BHU/Desktop/Student.txt");
        PrintStream ps=new PrintStream(fos);
        student s=new student();
        s.roll=10;
        s.name="shambhu pandey";
        s.dept="Computer Science";

        ps.println(s.roll);
        ps.println(s.name);
        ps.println(s.dept);
        ps.close();
        fos.close();
    }
}
