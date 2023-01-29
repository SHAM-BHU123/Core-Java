public class Jenericdemo {
    public static void main(String[] args) {

        Object obj[]=new Object[3];
        obj[0]="shambhu";
        obj[1]="pandey";
        obj[3]=new Integer(10);

        String str;
        for (int i=0;i<3;i++){
            str=(String)obj[i];

        }
        

    }
}
