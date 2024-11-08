package academy.devddojo.maratonajava.javacore.Oexception.excepetion.test;

import academy.devddojo.maratonajava.javacore.Oexception.excepetion.dominio.LoginInvalidoException;

import java.util.Scanner;

public class LoginInvalidoexcpetionTest01 {
    public static void main(String[] args) {
    try {
        logar();
    }catch (LoginInvalidoException e){
        e.printStackTrace();
    }
    }

    private static void logar() throws LoginInvalidoException {
        Scanner teclado = new Scanner(System.in);
        String usernameDB = "goku";
        String senhaDB = "ssj";
        System.out.println("Usuário");
        String usernameDigitado = teclado.nextLine();
        System.out.println("senha");
        String senhaDigitada = teclado.nextLine();
        if (!usernameDB.equals(usernameDigitado) || !senhaDB.equals(senhaDigitada)) {
            throw new LoginInvalidoException("Usuario ou senha inválidos");
        }
        System.out.println("Usuario logado com sucesso");
    }
}
