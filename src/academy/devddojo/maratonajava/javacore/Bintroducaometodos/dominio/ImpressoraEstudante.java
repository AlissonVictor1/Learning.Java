package academy.devddojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante)
    //estudante recebe estudante01 ou estudante02 como argumento e usa os dados (nome,sexo,idade)
    {
        System.out.println("----------");

        System.out.println(estudante.nome);
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        estudante.nome = "Gohan"; //o que acontece
    }
}
