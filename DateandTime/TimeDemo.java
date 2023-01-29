import java.time.LocalTime;

public class TimeDemo {
    public static void main(String[] args) {
        LocalTime l=LocalTime.now();
        int h=l.getHour();
        int m=l.getMinute();
        int s=l.getSecond();
        int n=l.getNano();

        System.out.printf("%d:%d:%d:%d",h,m,s,n);
    }
}
