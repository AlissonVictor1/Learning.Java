package academy.devddojo.maratonajava.introducao;

import org.w3c.dom.ls.LSOutput;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // Inicializa o array com os dias de cada mês.
        // Janeiro, Março, Maio, Julho, Agosto, Outubro, Dezembro - 31 dias
        // Fevereiro - 28 dias (ignorando anos bissextos para simplificação)
        // Abril, Junho, Setembro, Novembro - 30 dias
        String[][] dias = new String[12][];

        dias[0] = new String[31]; // Janeiro
        dias[1] = new String[28]; // Fevereiro
        dias[2] = new String[31]; // Março
        dias[3] = new String[30]; // Abril
        dias[4] = new String[31]; // Maio
        dias[5] = new String[30]; // Junho
        dias[6] = new String[31]; // Julho
        dias[7] = new String[31]; // Agosto
        dias[8] = new String[30]; // Setembro
        dias[9] = new String[31]; // Outubro
        dias[10] = new String[30]; // Novembro
        dias[11] = new String[31]; // Dezembro

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                dias[i][j] = (j + 1) + "º dia de " + nomeMes(i);
            }
        }
        System.out.println(dias[4][0]);
    }   private static String nomeMes(int indice) {
        switch (indice) {
            case 0:
                return "janeiro";
            case 1:
                return "fevereiro";
            case 2:
                return "março";
            case 3:
                return "abril";
            case 4:
                return "maio";
            case 5:
                return "junho";
            case 6:
                return "julho";
            case 7:
                return "agosto";
            case 8:
                return "setembro";
            case 9:
                return "outubro";
            case 10:
                return "novembro";
            case 11:
                return "dezembro";
            default:
                return "";
        }
        }
    }


