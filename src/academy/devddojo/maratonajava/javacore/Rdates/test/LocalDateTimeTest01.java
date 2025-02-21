package academy.devddojo.maratonajava.javacore.Rdates.test;


import java.time.*;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate date = LocalDate.parse("2022/03/08");
        LocalTime time = LocalTime.parse("09:45:00");
        System.out.println(localDateTime);
        System.out.println(date);
        LocalDateTime localDateTime1 = date.atTime(time);


    }
}
