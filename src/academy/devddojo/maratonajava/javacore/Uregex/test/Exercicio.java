package academy.devddojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercicio {
    public static void main(String[] args) {
        String texto = "0xz";
        validadordeHexadecimal(texto);
    }

    public static Boolean ishexadecimal(String texto) {
        String regex = "0[xX][0-9a-fA-F]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        return matcher.find();
    }

    public static void  validadordeHexadecimal(String texto){
        if(ishexadecimal(texto)){
        System.out.println("o texto: "+ texto+" é um hexadecimal");
        }else {System.out.println("o texto: "+ texto+" não é um hexadecimal");}
}}
