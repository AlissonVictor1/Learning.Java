package academy.devddojo.maratonajava.javacore.Eblocosdeinicialização.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    {
        //bloco de inicialização muda
        this.episodios = new int[1000];
        for (int i = 0; i < this.episodios.length; i++) {
            episodios[i] = i;

        }
    }public Anime() {
        for (int numeros : episodios) {
            System.out.println(episodios[numeros]);
        }

        }


    }