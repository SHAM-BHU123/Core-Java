
class negativedimensionException extends Exception{
    public String toString(){
        return "dimension of the area can't be negative";
    }
}



public class userDefinedException {
    static int area(int l,int b)
            throws negativedimensionException
    {

        if (l < 0 || b < 0)
            throw new negativedimensionException();

        return l*b;
    }
    static void meth1()throws negativedimensionException{
        System.out.println(area(2,10));
    }
    public static void main(String[] args) throws negativedimensionException {
        try {
            meth1();
        }
       catch (negativedimensionException e){
           System.out.println(e);
       }
    }
}

