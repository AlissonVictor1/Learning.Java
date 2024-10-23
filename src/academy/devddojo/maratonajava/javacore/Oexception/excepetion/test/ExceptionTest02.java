package academy.devddojo.maratonajava.javacore.Oexception.excepetion.test;

import java.io.File;
import java.io.IOException;
//try {
//    // Código que pode gerar uma exceção
//}

//catch (ExceptionType e) {
//    // Código para tratar a exceção
//}
public class ExceptionTest02 {
    public static void main(String[] args)throws IOException {
    criarNovoArquivo();
    }

    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo\\teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado" + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }

    }
}
