package academy.devddojo.maratonajava.javacore.FmodificadoresEstaticos.test;

import academy.devddojo.maratonajava.javacore.FmodificadoresEstaticos.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro c1 = new Carro("BMW",30);
       //modificador estatico
        // o modificador estatico ele faz o atributo pertencer a classe.
        Carro.setVelocidadelimite(180);
        c1.imprime();
    }


}
