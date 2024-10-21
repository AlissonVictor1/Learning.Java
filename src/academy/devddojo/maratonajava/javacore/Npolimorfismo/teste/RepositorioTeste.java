package academy.devddojo.maratonajava.javacore.Npolimorfismo.teste;

import academy.devddojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devddojo.maratonajava.javacore.Npolimorfismo.services.RepositorioArquivo;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();
    }
}
