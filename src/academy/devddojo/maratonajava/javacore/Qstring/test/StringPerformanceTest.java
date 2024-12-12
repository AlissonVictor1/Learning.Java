package academy.devddojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(1000);
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1000);
       fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String " + (fim - inicio) + "ms");
    }
        private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);


        }}
        private static void concatString ( int tamanho){
            String texto = " ";
            for (int i = 0; i < tamanho; i++) {
                texto += i; //0 ,01,012,013

            }
        }
    }

