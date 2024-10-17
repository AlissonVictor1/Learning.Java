package academy.devddojo.maratonajava.javacore.Npolimorfismo.services;

import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
public static void calcularImposto(Produto produto){
    System.out.println("Relatorio de imposto");
    double imposto = produto.calcularImposto();
    System.out.println("Produto: " +produto.getNome());
    System.out.println("Preço: " +produto.getValor());
    System.out.println("Imposto a ser pago: " + imposto);
    Tomate tomate = (Tomate) produto;
    System.out.println(tomate.getDataValidade());

}
}
