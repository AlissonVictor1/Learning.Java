package academy.devddojo.maratonajava.javacore.FmodificadoresEstaticos.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    private static double velocidadelimite = 250; // nao é um atributo de instancia, é um atributo estático de classe.

    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public void imprime(){

        System.out.println("-----------");
        System.out.println("Nome " +this.nome);
        System.out.println("Velocidade Maxima " +this.velocidadeMaxima);
        System.out.println("velocidade limite " +Carro.velocidadelimite);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public double getVelocidadelimite() {
        return velocidadelimite;
    }

    public static void setVelocidadelimite(double velocidadelimite) {
        Carro.velocidadelimite = velocidadelimite;
    }

}
