package academy.devddojo.maratonajava.introducao;

public class Aula5EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 18;
        boolean infatil = idade <15;
        boolean juvenil = idade >= 15 && idade < 18;
        String categoria;
        if(infatil){
            categoria = "Infantil";
        }else if(juvenil){
            categoria = "Juvenil";
        }else {
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
