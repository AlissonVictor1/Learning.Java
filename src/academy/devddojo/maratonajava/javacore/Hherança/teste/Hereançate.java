package academy.devddojo.maratonajava.javacore.Hherança.teste;

import academy.devddojo.maratonajava.javacore.Hherança.dominio.Endereco;
import academy.devddojo.maratonajava.javacore.Hherança.dominio.Funcionario;
import academy.devddojo.maratonajava.javacore.Hherança.dominio.Pessoa;

public class Hereançate {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("rua jamacaru","60865310");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Roberto");
        funcionario.setCpf("62123158330");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2500);
        funcionario.imprime2();
    }
}
