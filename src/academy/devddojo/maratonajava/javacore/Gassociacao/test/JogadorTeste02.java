package academy.devddojo.maratonajava.javacore.Gassociacao.test;

import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devddojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time1 = new Time("Seleção Brasileira");
        jogador1.setTime(time1);
        jogador1.imprime();
    }
}
