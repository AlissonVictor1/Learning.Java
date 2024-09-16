package academy.devddojo.maratonajava.javacore.Gassociacao.test;

import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Escola escola1 = new Escola("pontes");
        Professor professor1 = new Professor("fábio");
        Professor professor2 = new Professor("Acacio");
        System.out.println(escola1.getProfessores());
    }
}
