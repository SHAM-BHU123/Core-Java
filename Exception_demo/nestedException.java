public class nestedException {
    public static void main(String[] args) {
        int A[]={12,23,34,3,0};
        try {
            int c = A[0] / A[1];
            System.out.println(c);
            System.out.println(A[5]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        catch (ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("This two exception run smoothly");
    }
}
