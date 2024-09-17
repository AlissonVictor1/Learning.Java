package academy.devddojo.maratonajava.javacore.Gassociacao.test;

import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Professores;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Escola escola1 = new Escola("pontes");
        Professores professor1 = new Professores("fábio");
        Professores professor2 = new Professores("Acacio");
        System.out.println(escola1.getProfessores());
    }
}
