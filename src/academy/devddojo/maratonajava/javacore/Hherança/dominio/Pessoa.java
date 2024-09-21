package academy.devddojo.maratonajava.javacore.Hherança.dominio;

public class Pessoa extends Object {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Dentro do bloco estatico de pessoa");
    }
    {
        System.out.println("Dentro do bloco de inicialização de pessoa");
    }
    public Pessoa(String nome){
        System.out.println("Dentro do Construtor de pessoa");
        this.nome = nome;
    }
    public void imprime(){
        System.out.println(nome);
        System.out.println(cpf);
        System.out.println(endereco);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
