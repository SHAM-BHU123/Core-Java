import java.util.Scanner;

public class exceptionDemo {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the two number:");
        a=sc.nextInt();
        b=sc.nextInt();
        try {
            int c = a / b;
            System.out.println("Division is "+c);
        }
         catch (ArithmeticException e) {
            System.out.println("please enter the number other then zero");

        }


        System.out.println("bye");
       }
    }

