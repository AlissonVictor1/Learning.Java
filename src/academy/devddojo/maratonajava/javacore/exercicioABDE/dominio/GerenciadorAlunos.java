package academy.devddojo.maratonajava.javacore.exercicioABDE.dominio;


public class GerenciadorAlunos {
    private Aluno[] alunos;
    private int contador;

    // Construtor
    public GerenciadorAlunos(int tamanho) {
        alunos = new Aluno[tamanho];
        contador = 0;
    }

    // Adicionar aluno
    public void adicionarAluno(Aluno aluno) {
        if (contador < alunos.length) {
            alunos[contador] = aluno;
            contador++;
        } else {
            System.out.println("Não há mais espaço para novos alunos.");
        }
    }

    // Calcular a média das notas
    public double calcularMediaNotas() {
        double soma = 0;
        for (int i = 0; i < contador; i++) {
            soma += alunos[i].getNota();
        }
        return contador > 0 ? soma / contador : 0;
    }

    // Exibir lista de alunos
    public void exibirAlunos() {
        for (int i = 0; i < contador; i++) {
            System.out.println(alunos[i]);
        }
    }
    public void exibirAlunos2(){
        System.out.println(alunos[1]);
    }
}
