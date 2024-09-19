package academy.devddojo.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa {
    private double salario;

   //override: sobreescreve o metodo imprime() do objeto pessoa.
    public void imprime2(){
    imprime();
        System.out.println(salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
