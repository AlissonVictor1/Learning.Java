package academy.devddojo.maratonajava.javacore.Npolimorfismo.services;

import academy.devddojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivoo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando Arquivo");

    }
}
