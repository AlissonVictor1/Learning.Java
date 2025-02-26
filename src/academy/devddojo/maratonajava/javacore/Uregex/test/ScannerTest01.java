package academy.devddojo.maratonajava.javacore.Uregex.test;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto= "Levi, Eren, Mikasa";
        String[] split = texto.split(",");  //delimitador
        for (String s : split) {
            System.out.println(s.trim());
        }

    }}
