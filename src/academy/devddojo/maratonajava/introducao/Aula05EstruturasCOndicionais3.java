package academy.devddojo.maratonajava.introducao;

public class Aula05EstruturasCOndicionais3 {
    public static void main(String[] args) {
       // String resultado = (condicao) ? verdadeiro : falso;
        double salario = 2500;
        String mensagemum = "Você é assalarioado";
        String mensagemdois = "você não é assalarioado";
        String resultado = salario < 1401 ? mensagemum : mensagemdois;
        System.out.println(resultado);

    }
}
