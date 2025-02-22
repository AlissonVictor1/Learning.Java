package academy.devddojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
       // now = now.withDayOfMonth(20);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY)); //se for quinta hoje continua quinta , se nao for ele vai pra proxima quinta
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        now = LocalDate.now().with(TemporalAdjusters.previousOrSame(DayOfWeek.THURSDAY));
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());


    }
}


