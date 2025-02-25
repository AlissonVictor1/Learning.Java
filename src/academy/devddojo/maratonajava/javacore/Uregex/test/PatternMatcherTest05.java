package academy.devddojo.maratonajava.javacore.Uregex.test;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest05 {
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
        // . 1.3 = 123,133,1@3, 1A3

        String regex = "([a-zA-Z0-9\\._-])+@([a-zA-Z])+(\\.([a-zA-Z])+)+"; //validador de email
        // ([a-zA-Z0-9]\._-) Esse trecho precisa se repetir uma ou mais vezes
        String texto2 = "luffy@hotmail.com, 123jotaro@gmail.com, !@$$zoro@mail.br, teste@gmail.com, sakura@mail";

        System.out.println("!@$$zoro@mail.br".matches(regex));
        System.out.println(Arrays.toString(texto2.split(",")));

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  " + texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex   " + regex);
        System.out.println("Posicoes encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");
        }



    }
}
