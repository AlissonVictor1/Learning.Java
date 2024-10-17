package academy.devddojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devddojo.maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("i798324Mx",2500);
        CalculadoraImposto.calcularImposto(computador);
        Televisao televisao = new Televisao("Samsung 50 pol",3200);
        System.out.println("----------------");
        CalculadoraImposto.calcularImposto(televisao);
    }
}
