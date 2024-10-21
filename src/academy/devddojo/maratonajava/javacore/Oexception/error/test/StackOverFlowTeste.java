package academy.devddojo.maratonajava.javacore.Oexception.error.test;

public class StackOverFlowTeste {
    public static void main(String[] args) {
        recursividade();
    }
    public static void recursividade(){
        recursividade();
    }
}
