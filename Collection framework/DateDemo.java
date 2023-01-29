import javax.xml.crypto.Data;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateDemo {
    public static void main(String[] args) {
        //System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
        Date d=new Date();
        System.out.println(d);

        GregorianCalendar g=new GregorianCalendar();

        System.out.println(g.getTimeZone());
    }
}
