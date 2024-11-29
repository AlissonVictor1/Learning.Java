package academy.devddojo.maratonajava.javacore.Oexception.excepetion.test;

import academy.devddojo.maratonajava.javacore.Oexception.excepetion.dominio.Funcionario;
import academy.devddojo.maratonajava.javacore.Oexception.excepetion.dominio.LoginInvalidoException;
import academy.devddojo.maratonajava.javacore.Oexception.excepetion.dominio.Pessoa;

public class SobreescritaComExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        try {
            funcionario.salvar();
        }catch (LoginInvalidoException e){
            e.printStackTrace();
        }
    }
}
