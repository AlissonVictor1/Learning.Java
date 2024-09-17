package academy.devddojo.maratonajava.javacore.Gassociacao.dominio;

public class Alunos {
    private String nome;
    private Seminario seminario;

    public Alunos(String nome, Seminario seminario) {
        this.nome = nome;
        this.seminario = seminario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
