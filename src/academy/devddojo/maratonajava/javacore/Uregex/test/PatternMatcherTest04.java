package academy.devddojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        //  \d = Todos os dígitos
        //  \D = Tudo o que não for dígito
        // \s = Espaços em branco \t \n \f \r
        // \S = Todos os caracteres excluindo os brancos
        // w = a-ZA-Z, digitos, _
        // W = tudo o que não for incluso no /w
        // [] a-zA-C

        // ? Zero ou uma String regex = "a?b"; // "b" ou "ab" são válidos
        //* Zero ou mais String regex = "a*b"; // "b", "ab", "aaab" são válidos
        //+ uma ou mais String regex = "a+b"; // "ab", "aaab" são válidos, mas "b" não
        //{n,m} de n até m String regex = "a{3}b"; // "aaab" é válido
        // String regex = "a{3}b"; // "aaab" é válido O elemento anterior deve aparecer exatamente n vezes.
        //String regex = "a{2,}b"; // "aab", "aaab" são válidos O elemento anterior deve aparecer no mínimo n vezes
        // String regex = "a{2,4}b"; // "aab", "aaab", "aaaab" são válidos O elemento anterior deve aparecer entre n e m vezes.
        //()
        // | o(v/c)o ovo | oco
        // $

        String regex = "0[xX]([0-9a-fA-F])+";
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
