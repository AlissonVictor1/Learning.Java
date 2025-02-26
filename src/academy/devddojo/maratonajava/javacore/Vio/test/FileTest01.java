package academy.devddojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("path: "+file.getAbsolutePath());
            System.out.println("Created "+ isCreated);
            System.out.println("is directory "+file.isDirectory());
            System.out.println("is file "+file.isFile());
            System.out.println("last modified "+new Date(file.lastModified()));
            boolean exists = file.exists();
            if(exists){
                System.out.println("Deletado "+ file.delete());
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
