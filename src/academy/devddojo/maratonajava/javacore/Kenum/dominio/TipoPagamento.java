package academy.devddojo.maratonajava.javacore.Kenum.dominio;

public enum TipoPagamento{
    DEBITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.1;
        }
    }, CREDITO{
        @Override
        public double calcularDesconto(double valor) {
            return valor * 0.05;
        }
    };

    public abstract double calcularDesconto(double valor);
    // ele é abstrato porque ele é um metodo sem uso que so é usado pra ser sobrescrito
}

