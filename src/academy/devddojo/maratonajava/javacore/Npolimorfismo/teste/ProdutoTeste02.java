package academy.devddojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        Produto produto = new Tomate("mussarela",5);
        System.out.println(produto.getNome());
        System.out.println(produto.calcularImposto());
    }
}
