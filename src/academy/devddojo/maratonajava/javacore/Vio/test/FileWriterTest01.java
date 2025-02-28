package academy.devddojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)) //Esse parenteses é porque a classe FileWriter implementa Closeable. Entao o try-withresources vai automaticamente fechar.
        {
            fw.write("O DevDojo é\n continuando a proxima linha ");
            fw.flush(); // Basicamente, o .flush() é um "empurrão" que garante que os dados saiam do buffer e cheguem ao destino final sem demora.

        } catch (IOException ex) {
           ex.printStackTrace();
        }
    }
}
