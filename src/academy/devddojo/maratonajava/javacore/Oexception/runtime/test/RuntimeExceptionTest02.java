package academy.devddojo.maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {
        divisao(1, 0);
    }

    /** ctrl enter
     *
     * @param a
     * @param b não pode ser zero
     * @return
     * @throws IllegalArgumentException caso b seja zero
     */
    private static int divisao(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Argumento ilegal");
        }
        return a / b;
    }

    {
    }
}
// try {
//    return a / b;
// }catch (RuntimeException e){
//     e.printStackTrace();
// }

// return 0;
//}

