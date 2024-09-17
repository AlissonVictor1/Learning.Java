package academy.devddojo.maratonajava.javacore.Gassociacao.dominio;

public class Time {
    private String nome; //da instancia
    private Jogador[] jogadores; //da instancia


    public Time(String nome) {
        this.nome = nome;
    }

    public Jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(Jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }
    public void imprime(){
        System.out.println(this.nome);
        if(jogadores == null) return; // nao é obrigatorio
        for (Jogador jogador : jogadores) {
            System.out.println(jogador.getNome());
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
