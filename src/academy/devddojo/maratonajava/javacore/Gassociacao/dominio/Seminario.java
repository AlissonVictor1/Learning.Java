package academy.devddojo.maratonajava.javacore.Gassociacao.dominio;

public class Seminario {
    private String nome;
    private String local;
    private Alunos [] alunos;

    @Override
    public String toString(){
        return "Nome "+ nome + ", Local: " + local;

    }

    public Seminario(String nome, String local) {
        this.nome = nome;
        this.local = local;
    }

    public Seminario(String nome, String local, Alunos [] alunos) {
        this.nome = nome;
        this.local = local;
        this.alunos = alunos;
    }
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.local);
    }
    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }




}
