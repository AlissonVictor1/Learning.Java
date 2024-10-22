package academy.devddojo.maratonajava.javacore.Oexception.excepetion.test;

import java.io.File;
import java.io.IOException;
//try {
//    // Código que pode gerar uma exceção
//}

//catch (ExceptionType e) {
//    // Código para tratar a exceção
//}
public class ExceptionTest01 {
    public static void main(String[] args) {
    criarNovoArquivo();
    }

    private static void criarNovoArquivo() {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado" + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
