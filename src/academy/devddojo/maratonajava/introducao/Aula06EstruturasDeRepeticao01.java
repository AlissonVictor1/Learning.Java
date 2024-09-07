package academy.devddojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main (String[] arg){
        //while, do while, for
        int count = 0;
        while(count < 10){
            System.out.println(++count);

        }
        do{
            System.out.println("dentro dowhile" + ++count);
        }while(count < 10);

        for(int c=0;c<10;c++){
            System.out.println("for"+ c);

        }


    }
}
