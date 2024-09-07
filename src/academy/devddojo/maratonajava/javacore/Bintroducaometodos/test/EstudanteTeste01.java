package academy.devddojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devddojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devddojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.nome = "Midorya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';
        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
        System.out.println("------------");
       // estudante02.nome = "Sakura";
        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        //o que acontece. O estudante.01 que foi o argumento passado tem um endereço de memoria, que quando é reutilizado novamente quando a linha 20 é executada, ja fixa o valor "gohan" como nome.




    }
}
