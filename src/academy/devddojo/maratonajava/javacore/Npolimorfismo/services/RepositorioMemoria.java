package academy.devddojo.maratonajava.javacore.Npolimorfismo.services;

import academy.devddojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando em Memoria");

    }
}
