public class nestedCatch {
    public static void main(String[] args) {
        int A[]={30,20,10,40,0};
        try {
            int c = A[0] / A[4];
            System.out.println(c);
            System.out.println(A[3]);
        }

        catch (ArithmeticException e){
            System.out.println(e);
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println(" Program run Successfully ");
    }
}
