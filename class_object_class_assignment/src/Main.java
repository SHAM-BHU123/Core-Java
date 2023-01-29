public class Main {
    public static void main(String[] args) {
        Student student=new Student();
        student.setStudent_id(1);
        student.setStudent_name("shambhu pandey");
        student.setFaculty("Engineering");
        student.setBranch("Mechanical");

        System.out.println("Stuent ID "+" :"+student.getStudent_id());
        System.out.println("student name"+" :"+ student.getStudent_name());
        System.out.println("student facilty"+": "+student.getFaculty());
        System.out.println("student branch"+": "+student.getBranch());
    }
}