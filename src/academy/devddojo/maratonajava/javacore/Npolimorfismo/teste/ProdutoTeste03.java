package academy.devddojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devddojo.maratonajava.javacore.Npolimorfismo.services.CalculadoraImposto;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Produto produto = new Computador("i798324Mx",2500);
        Tomate tomate = new Tomate("americano",25);
        tomate.setDataValidade("11/12/2024");
        CalculadoraImposto.calcularImposto(tomate);


    }
}