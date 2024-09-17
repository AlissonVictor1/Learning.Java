package academy.devddojo.maratonajava.javacore.Gassociacao.test;

import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("cafu");
        Jogador jogador2 = new Jogador("Pelé");
        Time time1 = new Time("Brasil");
        Jogador [] jogadores = {jogador1,jogador2};
        jogador1.setTime(time1);
        time1.setJogadores(jogadores);
        jogador2.setTime(time1);

        System.out.println("---------------jogador");
        jogador1.imprime();
        System.out.println("---------------jogador");
        jogador2.imprime();
        System.out.println("---------------time");
        time1.imprime();


    }
}
