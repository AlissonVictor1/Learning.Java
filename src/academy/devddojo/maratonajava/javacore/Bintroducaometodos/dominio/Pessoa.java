package academy.devddojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Pessoa {
    private String nome;
    private int idade;
    //private somente o objeto pode acessar

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }
    public void setNome(String nome){
        nome = nome;
    }

}
