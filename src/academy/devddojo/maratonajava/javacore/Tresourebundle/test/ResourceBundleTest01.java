package academy.devddojo.maratonajava.javacore.Tresourebundle.test;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleTest01 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        ResourceBundle bundle = ResourceBundle.getBundle("messages", new Locale("pt_BR"));
        ResourceBundle bundleus = ResourceBundle.getBundle("messages", new Locale("en_US"));
        boolean sasa = bundle.containsKey("sasa");
        String hello = bundle.getString("hello");
        System.out.println(hello);
        System.out.println(bundleus.getString("hello"));
        //Locale("fr","CA");
        // messages_fr_CA.properties
        // messages_fr.properties
        // messages_fr.properties
        // ele vai procurar no default
        // messages_pt_BR.properties
        // messages_pt.properties
        // messages.properties
        System.out.println(bundle.getString("hi"));
    }
}
