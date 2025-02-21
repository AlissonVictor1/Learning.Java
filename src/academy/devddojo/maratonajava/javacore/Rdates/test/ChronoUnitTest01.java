package academy.devddojo.maratonajava.javacore.Rdates.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime aniversario = LocalDateTime.of(2006,01,7,12,0,0);
        LocalDateTime now = LocalDateTime.now();
        long betweentime = ChronoUnit.DAYS.between(aniversario, now);
        System.out.println(betweentime);
        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
    }
}
