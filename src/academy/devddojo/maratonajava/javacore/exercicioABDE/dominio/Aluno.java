package academy.devddojo.maratonajava.javacore.exercicioABDE.dominio;

public class Aluno {
    private String nome;
    private double nota;

    // Construtor
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    // Métodos get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Aluno: " + nome + ", Nota: " + nota;
    }
}
