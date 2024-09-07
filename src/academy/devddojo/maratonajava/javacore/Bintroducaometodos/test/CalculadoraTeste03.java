package academy.devddojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devddojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(23,2);
        System.out.println(result);
    }
}
