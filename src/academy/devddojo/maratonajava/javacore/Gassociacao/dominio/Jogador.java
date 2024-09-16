package academy.devddojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {
    private String nome;
    private Time time;

    public void imprime(){
        System.out.println(this.nome);
      //pode nao existir o time
        if(time!=null){
            System.out.println(time.getNome()  );
        }
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public Jogador(String nome){
        this.nome = nome;
    }
}
