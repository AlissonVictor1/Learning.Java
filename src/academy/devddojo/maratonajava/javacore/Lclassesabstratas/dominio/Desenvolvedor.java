package academy.devddojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Desenvolvedor extends Funcionario{
    @Override
    public void calculaBonus() {
        this.salario = this.salario + salario * 0.2;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
}
