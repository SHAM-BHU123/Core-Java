import java.time.LocalDate;

public class DateTimeDemo {
    public static void main(String[] args) {
        LocalDate d=LocalDate.now();
        System.out.println(d);
        int dd=d.getDayOfMonth();
        int mm=d.getMonthValue();
        int yyyy=d.getYear();
        System.out.println(yyyy+" "+mm+" "+dd);
        System.out.printf("%d-%d-%d",yyyy,mm,dd);
    }
}
