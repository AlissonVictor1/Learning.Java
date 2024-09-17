package academy.devddojo.maratonajava.javacore.Gassociacao.test;

import java.util.Scanner;

public class LeituradoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        String nome = entrada.nextLine();
        System.out.println("Qual a sua idade?");
        int idade = entrada.nextInt();
        System.out.println("Bom dia "+nome);
        System.out.println("Você tem "+idade+" anos de idade");
        System.out.println("Digite M ou F para o seu sexo");
        char sexo = entrada.next().charAt(0);//caracter na posição 0


    }
}
