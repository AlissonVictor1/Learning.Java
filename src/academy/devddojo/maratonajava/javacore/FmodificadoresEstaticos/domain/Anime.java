package academy.devddojo.maratonajava.javacore.FmodificadoresEstaticos.domain;

public class Anime {
    private String nome;
    private static int[] episodios;
    //todo anime contém episodios.

    //0 - Bloco de inicialização é executado quando a JVM carregar classe
    //1 - Alocado espaco em memoria pro objeto
    //2 - Cada atributo de classe é criado e inicializado com valores defaults ou o que for parametrizado
    //3 - bloco de inicialização é executado
    //4 - construtor é executado


    //todo anime tem 1000 episodios.
    static {
        //bloco de inicialização muda
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[1000];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i+1;

        }
    }public Anime() {
        for (int numeros : episodios) {
            System.out.print(numeros + "");
        }
        System.out.println();

        }


    }