package academy.devddojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devddojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Ferrari";
        carro1.modelo = "LaFerrari";
        carro1.ano = 2022;

        Carro carro2 = new Carro();
        carro2.nome = "Verdão";
        carro2.modelo = "Gol";
        carro2.ano = 2007;

        carro1 = carro2;

        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);
        System.out.println("---------");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }

}
