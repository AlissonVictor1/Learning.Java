package academy.devddojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    public Anime(String nome,String tipo, int episodios, String genero){
        this.nome = nome;
    }
    public Anime(){
        this("Haikyiu","anime",12,"gae");

    }
}
