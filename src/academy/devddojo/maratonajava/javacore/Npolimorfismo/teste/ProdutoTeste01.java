package academy.devddojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("i798324Mx",2500);
        System.out.println(computador.calcularImposto());
    }
}
