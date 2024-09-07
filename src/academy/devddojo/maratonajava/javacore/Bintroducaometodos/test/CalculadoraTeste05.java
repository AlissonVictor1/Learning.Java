package academy.devddojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devddojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double [] notas = {7,8};
        calculadora.mediaArray(notas);
        calculadora.mediaVarArgs(8,5,6,9,8);
    }
}
