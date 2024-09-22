package academy.devddojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.devddojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Carro2");
        System.out.println(carro.COMPRADOR);
        //A referencia ao objeto nao pode ser alterada, porem os dados do objeto podem.
    }
}
