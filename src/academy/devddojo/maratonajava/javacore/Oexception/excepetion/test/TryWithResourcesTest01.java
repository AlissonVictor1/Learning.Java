package academy.devddojo.maratonajava.javacore.Oexception.excepetion.test;

import academy.devddojo.maratonajava.javacore.Oexception.excepetion.dominio.Leitor1;
import academy.devddojo.maratonajava.javacore.Oexception.excepetion.dominio.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        LerArquivo3();

    }
    public static void  LerArquivo3(){
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()){

        }catch (IOException e){

        }
    }
    public static void lerArquivo2() {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
        } catch (IOException e) {

        }

    }


    public static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
