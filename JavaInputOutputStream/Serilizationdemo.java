import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
   private int roll;
    private  String name;
    private float avg;
     private String dept;
     public static int data=10;
     public transient int t;

     public Student(){};

     public Student(int r,String n,Float a,String d){
         roll=r;
         name=n;
         avg=a;
         dept=d;
         data=500;
         t=500;
     }

     public String toString(){
         return "/n Student Details/n"+
                 "/n Roll no of student is/n"+roll+
                 "/n Name of a student is/n"+name+
                 "/n Average mark is /n"+ avg+
                 "/n Depth/n"+dept+
                 "/n Data/n"+data+
                 "/n Transient/n"+t;
     }

}




public class Serilizationdemo {

    public static void main(String[] args) throws  Exception{
        FileOutputStream fos=new FileOutputStream("C:\\Users\\SAM BHU\\Desktop\\student.txt");

        ObjectOutputStream oos=new ObjectOutputStream(fos);
        Student s=new Student(10,"shambhu pandey",23.45f,"Computer Science");
        oos.writeObject(s);
        fos.close();
        oos.close();

    }
}
