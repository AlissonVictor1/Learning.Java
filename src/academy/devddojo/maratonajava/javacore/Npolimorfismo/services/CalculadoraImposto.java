package academy.devddojo.maratonajava.javacore.Npolimorfismo.services;

import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio.Taxavel;

public class CalculadoraImposto implements Taxavel {


    @Override
    public double calcularImposto() {
        return 0;
    }
}
