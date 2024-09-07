package academy.devddojo.maratonajava.introducao;

public class Aula06EstruturasDeREpretição05 {
    public static void main (String[] args){
        //dado o valor de um acrro, descubra quantas vezes ele pode ser parcelado
        //condição valorparcela >= 1000
        double valortotal = 30000;
        for (int parcela =(int) valortotal; parcela >= 1 ; parcela--) {
            double valorparcela = valortotal/ parcela;
            if(valorparcela < 1000){
                continue;
            }
            System.out.println("Parcela "+ parcela+ " R$ "+valorparcela);
        }
    }
}
