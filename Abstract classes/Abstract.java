abstract class shape{
    abstract void area();
    abstract void perimeter();
}

class Circle extends shape{
   int radius=8;

    @Override
    void area() {
        System.out.println(Math.PI*radius*radius);
    }

    @Override
    void perimeter() {
        System.out.println(2*Math.PI*radius);
    }
}

class Rectagle extends shape{
    int length=12;
    int breath=13;

    void Rectangle(int length,int breath){
        this.length=length;
        this.breath=breath;
    }

    @Override
    void area() {
        System.out.println(length*breath);
    }
    void perimeter(){
        System.out.println(2*(length*breath));
    }
}




public class Abstract {
    public static void main(String[] args) {
        System.out.println("**********");
       shape s= new Circle();
       s.area();
       s.perimeter();

        System.out.println("***********");
        shape S=new Rectagle();
        S.area();
        S.perimeter();

    }
}
