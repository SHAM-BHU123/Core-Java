import java.time.LocalDateTime;

public class LocalTimeDemo {
    public static void main(String[] args) {
        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);
        int dd=ldt.getDayOfMonth();
        int mm=ldt.getMonthValue();
        int yy=ldt.getYear();

    }
}
