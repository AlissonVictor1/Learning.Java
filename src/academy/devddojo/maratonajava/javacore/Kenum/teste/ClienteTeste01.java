package academy.devddojo.maratonajava.javacore.Kenum.teste;

import academy.devddojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devddojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devddojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;


public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro",TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Fisica");
        System.out.println(tipoCliente);
    }

}
