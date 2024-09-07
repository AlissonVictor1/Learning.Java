package academy.devddojo.maratonajava.introducao;

public class Aula07Arrays04 {
    public static void main(String[] args) {
        int [] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{1,2,3,4,5};
        for (int i = 0; i <numeros2.length  ; i++) {

        }
        //num oque acontece - for (int num = 0; num < numero3.lenght; num++)
        // num = numeros3[0]
        for(int num:numeros3){
            System.out.println(num);
        }
    }
}
