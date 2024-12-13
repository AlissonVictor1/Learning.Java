package academy.devddojo.maratonajava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale LocalePt = new Locale("pt", "BR");
        Locale LocaleJP = Locale.JAPANESE;
        Locale LocaleIT = Locale.ITALY;
        Locale LocaleUS = Locale.US;

        NumberFormat[] nfa = new NumberFormat[4];
        nfa[0]= NumberFormat.getCurrencyInstance(LocaleUS);
        nfa[1]= NumberFormat.getCurrencyInstance(LocaleIT);
        nfa[2]= NumberFormat.getCurrencyInstance(LocaleJP);
        nfa[3]= NumberFormat.getCurrencyInstance(LocalePt);
        double valor = 10_000.2130;
        for (NumberFormat numberFormat : nfa) {

            System.out.println(numberFormat.format(valor));
        }String valorString = "$10,000.21";
        try {
            System.out.println(nfa[0].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
