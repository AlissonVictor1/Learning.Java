package academy.devddojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {
    public static void main(String[] args) {
        //formas de inicializar o array multidimensional
        //ctrl alt L
        int[] array = {1, 2, 3};
        int[][] arrayInt = new int[3][];
        arrayInt[0] = new int[2];//array de duas posições em arrayint[0]
        arrayInt[1] = array;
        arrayInt[2] = new int[]{1, 2, 3, 4, 5, 6};

        int[][] arrayInt2 = {{1, 2, 3}, {1, 3}, {1, 4, 2, 3, 3}};

        for (int[] arrayBase : arrayInt) {
            for (int num : arrayBase) {

            }
        }
    }
}
