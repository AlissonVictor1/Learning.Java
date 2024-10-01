package academy.devddojo.maratonajava.javacore.Minterfaces.test;

import academy.devddojo.maratonajava.javacore.Minterfaces.dominio.DataLoader;
import academy.devddojo.maratonajava.javacore.Minterfaces.dominio.DatabaseLoader;
import academy.devddojo.maratonajava.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader= new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        fileLoader.load();
        databaseLoader.load();
        DataLoader.retrieveMaxDataSize();
    }
}
