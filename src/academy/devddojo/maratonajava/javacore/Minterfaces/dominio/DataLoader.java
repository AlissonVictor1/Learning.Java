package academy.devddojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
   public static final int MAX_DATA_SIZE = 10;
    public abstract void load();

    default void check(){
        System.out.println("permissao");
    }
    public static void retrieveMaxDataSize(){
        System.out.println("Dentro do retrievemaxdatasize na interface");
    }
}
