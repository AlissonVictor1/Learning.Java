package academy.devddojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //  \d = Todos os dígitos
        //  \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // w = a-ZA-Z, digitos, _
        // W = tudo o que não for incluso no /w
        // [] a-zA-C

        String regex = "0[xX][0-9a-fA-F]";
        String texto2 = "0xf";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex   " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }
        System.out.println(matcher.hasMatch());

        // o que é necessario para ser um numero hexadecimal
        // 0x(qualquernumero/letra de -F

    }
}
