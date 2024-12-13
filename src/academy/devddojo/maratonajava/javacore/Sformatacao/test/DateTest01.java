package academy.devddojo.maratonajava.javacore.Sformatacao.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1734045426165L);  //long 100000
      date.setTime(date.getTime() + 3600000);
        System.out.println(date);

    }
}
