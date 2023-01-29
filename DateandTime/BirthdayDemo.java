import java.time.LocalDate;
import java.time.Period;

public class BirthdayDemo {
    public static void main(String[] args) {
        LocalDate bithday=LocalDate.of(1999, 1 ,15);
        LocalDate ld=LocalDate.now();
        Period p=Period.between(bithday,ld);
        System.out.printf("Age is %d year %d month %d day",p.getYears(),p.getMonths(),p.getDays());
    }
}
