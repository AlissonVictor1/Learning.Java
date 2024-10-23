package academy.devddojo.maratonajava.javacore.Oexception.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;
import java.sql.SQLException;

public class RuntimeExceptionTest04 {
    public static void main(String[] args) {
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("IndexOutOfBoundsException");
        }
        try {
            talvezlanceexcpetion();
        } catch (SQLException | FileNotFoundException e) {
        e.printStackTrace();
    }
}


private static void talvezlanceexcpetion () throws SQLException,FileNotFoundException{
}}
//nao pode usar exceções com parentesco no mesmo multicatch
