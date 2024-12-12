package academy.devddojo.maratonajava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome= "William Suane";
        nome.concat(" Devdojo");
        nome.substring(0,3);
        System.out.println(nome);
        StringBuilder sb = new StringBuilder("William Suane");
        sb.append(" Devdojo");
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb);
    }
}
