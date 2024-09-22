package academy.devddojo.maratonajava.javacore.Kenum.teste;

import academy.devddojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devddojo.maratonajava.javacore.Kenum.dominio.TipoCliente;

public class ClienteTeste01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Pedro", TipoCliente.PESSOA_FISICA);
        Cliente cliente21 = new Cliente("Pedro", TipoCliente.PESSOA_JURIDICA);
    }
}
