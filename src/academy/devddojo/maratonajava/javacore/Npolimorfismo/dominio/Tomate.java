package academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Tomate extends Produto{
    public final static double IMPOSTO = 0.06;
    private String dataValidade;

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Tomate(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println( "Calculando imposto do tomate");
        return this.valor * IMPOSTO;

    }
}
