package academy.devddojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {
private String nome;
 private Professores[] professores;
    public void imprime(){
        System.out.println(this.nome);
        if (professores == null)return;
        for (Professores professores : professores) {
            System.out.println(professores.getNome());

        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Professores[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professores[] professores) {
        this.professores = professores;
    }

    public Escola(String nome) {
        this.nome = nome;
    }


}
