package academy.devddojo.maratonajava.javacore.Lclassesabstratas.dominio;

public class Gerente extends Funcionario{
    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {

    }
}
