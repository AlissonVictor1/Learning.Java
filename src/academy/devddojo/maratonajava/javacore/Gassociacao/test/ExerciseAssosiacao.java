package academy.devddojo.maratonajava.javacore.Gassociacao.test;

import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Alunos;
import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Professores;
import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Seminario;

public class ExerciseAssosiacao {
    //Crie um siste que gerencia seminarios
    // o sistema devera cadastrar seminarios, estudantes, professores e local onde sera realizado.
    //um aluno podera estar em apenas um seminario
    public static void main(String[] args) {
        Seminario seminario1 = new Seminario("Trabalho Hidrografia","Campus CH");
        Alunos aluno1 = new Alunos("Pedro",seminario1);
        Seminario [] seminariosGeografia = {seminario1};
        Professores professor1 = new Professores("Felipe","Geografia",seminariosGeografia);
        System.out.println("Seminario1-----");
        System.out.println(seminario1);
        System.out.println("Aluno1------");
        System.out.println(aluno1);
        System.out.println("Professor1------");
        System.out.println(professor1);

    }
}
