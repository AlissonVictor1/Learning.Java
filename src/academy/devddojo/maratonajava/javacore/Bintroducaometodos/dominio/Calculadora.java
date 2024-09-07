package academy.devddojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10+10);
    }
    public void subtraiDoisNumeros(){
        System.out.println(12-10);
    }

    public void multiplicaDoisNumeros(int num, int num2){
        System.out.println(num * num2);

    }
    public double divideDoisNumeros(double num1, double num2){
        if(num2 == 0 ){
            return 0;
        }
        return num1/num2;
    }
    public double divideDoisNumeros02(double num1, double num2){
        if(num2 != 0 ){
            return num1/num2;
        }
        return 0;

    }
    public void imprimeDivisaoDeDoisNumeros (double num1, double num2){
        if(num2 ==0){
            System.out.println("Não existe divisão por zero");
            return;
        }
        System.out.println(num1/num2);
    }
    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1 "+num1);
        System.out.println("Num2 "+num2);
    }
    public void mediaArray(double[] numeros){
        double soma = 0;
                for(double num:numeros){
                    soma += num;
                }
        double media = soma/numeros.length;
        System.out.println(media);
    }
    public void mediaVarArgs(int... numeros){
        double soma = 0;
        for(double num:numeros){
            soma += num;
        }
        double media = soma/numeros.length;
        System.out.println(media);

    }
}
