package academy.devddojo.maratonajava.javacore.Rdates.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TemportalAdjusterTest01 {
    public static void main(String[] args) {
        // Dado uma determinada data, retorne o próximo dia útil dessa data
        LocalDate localDate = LocalDate.of(2025,2,22);
        System.out.println(proximoDiaUtil(localDate));
    }

    public static LocalDate proximoDiaUtil(LocalDate localDate){
        if(isWeekend(localDate)){
            localDate = localDate.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
            return localDate;
        }
        localDate = localDate.plusDays(1);
        return localDate;
    }

    public static boolean isWeekend(LocalDate localDate){
        if (localDate.getDayOfWeek() == DayOfWeek.FRIDAY
                || localDate.getDayOfWeek() == DayOfWeek.SATURDAY
                ||localDate.getDayOfWeek() == DayOfWeek.SUNDAY){
            return true;
        }
        return false;
    }
}
//
//class ObterProximoDiaUtil implements TemporalAdjuster {
//    @Override
//    public Temporal adjustInto(Temporal temporal) {
//        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
//        int addDays;
//        switch (dayOfWeek) {
//            case THURSDAY:
//                addDays = 4;
//                break;
//            case FRIDAY:
//                addDays = 3;
//                break;
//            case SATURDAY:
//                addDays = 2;
//                break;
//            default:
//                addDays = 1;
//        }
//
//        return temporal.plus(addDays, ChronoUnit.DAYS);
//    }
//}
//
//public class TemporalAdjusterTest01 {
//    public static void main(String[] args) {
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//        System.out.println(now.getDayOfWeek());
//
//        now = LocalDate.now().with(new ObterProximoDiaUtil());
//        System.out.println(now);
//        System.out.println(now.getDayOfWeek());
//
//        now = LocalDate.now().withDayOfMonth(15).with(new ObterProximoDiaUtil());
//        System.out.println(now);
//        System.out.println(now.getDayOfWeek());
//
//        now = LocalDate.now().withDayOfMonth(19).with(new ObterProximoDiaUtil());
//        System.out.println(now);
//        System.out.println(now.getDayOfWeek());
//
//        now = LocalDate.now().withDayOfMonth(20).with(new ObterProximoDiaUtil());
//        System.out.println(now);
//        System.out.println(now.getDayOfWeek());
//
//        now = LocalDate.now().withDayOfMonth(21).with(new ObterProximoDiaUtil());
//        System.out.println(now);
//        System.out.println(now.getDayOfWeek());
//    }
//}
