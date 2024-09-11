package academy.devddojo.maratonajava.javacore.exercicioABDE.test;

import academy.devddojo.maratonajava.javacore.exercicioABDE.dominio.Aluno;
import academy.devddojo.maratonajava.javacore.exercicioABDE.dominio.GerenciadorAlunos;

//Objetivo: Criar uma pequena aplicação para gerenciar uma lista de alunos.
// Cada aluno tem um nome e uma nota. O sistema deve
// permitir adicionar novos alunos, calcular a média das notas e exibir a lista de alunos.
public class AlunoTest {

        public static void main(String[] args) {
            GerenciadorAlunos gerenciador = new GerenciadorAlunos(1);

            // Adicionar alunos
            gerenciador.adicionarAluno(new Aluno("João", 8.5));


            // Exibir alunos
            gerenciador.exibirAlunos2();
        }
    }

