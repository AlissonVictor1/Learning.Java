package academy.devddojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
//Buffer é uma área de memória RAM temporária que armazena blocos de dados
public class BufferedWritterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true);
             BufferedWriter bw = new BufferedWriter(fw)) //Esse parenteses é porque a classe FileWriter implementa Closeable. Entao o try-withresources vai automaticamente fechar.
        {
            bw.write("O DevDojo é asjidnasijdnai iu iuai iandiua dnaidnausi dasunas anuasn uas naunasd nn ");
            bw.newLine();
            bw.flush(); // Basicamente, o .flush() é um "empurrão" que garante que os dados saiam do buffer e cheguem ao destino final sem demora.

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
