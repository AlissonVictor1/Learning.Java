package academy.devddojo.maratonajava.javacore.Rdates.test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest01 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeminus7hours = LocalTime.now().minusHours(7);
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        // duration nao aceita localdate por que nao tem segundos
        Duration d2 = Duration.between(timeNow, timeminus7hours);
        System.out.println(d1);
    }
}
