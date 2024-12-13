package academy.devddojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale LocalePt = new Locale("pt", "BR");
        Locale LocaleJP = Locale.JAPANESE;
        Locale LocaleIT = Locale.ITALY;
        Locale LocaleUS = Locale.US;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0]= NumberFormat.getInstance(LocaleUS);
        nfa[1]= NumberFormat.getInstance(LocaleIT);
        nfa[2]= NumberFormat.getInstance(LocaleJP);
        nfa[3]= NumberFormat.getInstance(LocalePt);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa) {
            numberFormat.setMaximumFractionDigits(2);
            System.out.println(numberFormat.format(valor));
        }
        String valorString = "1_000.2130";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
           e.printStackTrace();
        }
    }
}
