package academy.devddojo.maratonajava.javacore.Hherança.dominio;

public class Funcionario extends Pessoa {
    private double salario;
    static {
        System.out.println("Dentro do bloco estatico de funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicialização de funcionario");
    }

   //override: sobreescreve o metodo imprime() do objeto pessoa.

    public Funcionario(String nome){
        super(nome);
        System.out.println("Dentro do construtor de funcionario");
    }

    public void imprime(){
        super.imprime(); 
        System.out.println(salario);
    }
    public void relatorio(){
    // antes do protected    this.getNome();
        System.out.println(this.nome);

    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
