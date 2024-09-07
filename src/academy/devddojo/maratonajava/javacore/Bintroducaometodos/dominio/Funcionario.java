package academy.devddojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    String nome;
    int idade;
    double salario;

    public void imprimefuncionario(Funcionario funcionario){
        System.out.println(this.nome);
        System.out.println(this.salario);
        System.out.println(this.idade);

    }
    public String funcionario(Funcionario funcionario){
        return funcionario.nome;
    }
}
