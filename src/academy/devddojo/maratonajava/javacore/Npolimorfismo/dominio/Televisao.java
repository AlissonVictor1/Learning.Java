package academy.devddojo.maratonajava.javacore.Npolimorfismo.dominio;

public class Televisao extends Produto{
    public static final double IMPOSTO = 0.2;
    public Televisao(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println( "Calculando imposto da televisão");
        return this.valor * IMPOSTO;
    }
}
