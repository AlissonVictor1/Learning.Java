package academy.devddojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        // Cria um objeto File representando um diretório chamado "pasta"
        // O objeto File neste ponto é apenas uma referência - o diretório ainda não existe fisicamente
        File fileDiretorio = new File("pasta");

        // Tenta criar o diretório físico no sistema de arquivos
        // O metodo mkdir() retorna true se o diretório foi criado com sucesso
        // Retorna false se já existir ou se houver problemas de permissão
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println("Pasta Criada "+isDiretorioCriado);

        // Cria uma referência File para um arquivo chamado "aquivo.txt" dentro do diretório criado
        // Observe o uso do construtor que recebe o diretório pai e o nome do arquivo
        // Neste momento, o arquivo ainda não existe fisicamente
        File fileArquivoDiretorio = new File(fileDiretorio,"aquivo.txt");

        // Cria o arquivo físico no sistema de arquivos
        // createNewFile() retorna true se criou o arquivo ou false se já existia
        boolean isFileCreated = fileArquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado "+isFileCreated);

        // Cria uma referência para o novo nome do arquivo
        // Isso apenas prepara a operação de renomeação, não faz a alteração ainda
        File fileRenamed= new File(fileDiretorio,"arquivo_renomeado.txt");

        // Executa a operação de renomear o arquivo
        // renameTo() retorna true se a operação for bem-sucedida
        // Isso pode falhar se o arquivo de destino já existir ou por problemas de permissão
        boolean isRenamde = fileArquivoDiretorio.renameTo(fileRenamed);
        System.out.println("Arquivo Renomeado " +isRenamde);

        // Cria uma referência para o novo nome do diretório
        // Novamente, apenas prepara a operação de renomeação
        File diretorioRenamed = new File("paste2");

        // Renomeia o diretório de "pasta" para "paste2"
        // Esta operação move/renomeia o diretório e todo seu conteúdo
        // Pode falhar se o diretório de destino já existir ou por problemas de permissão
        boolean isDiretorioRenomeado = fileDiretorio.renameTo(diretorioRenamed);
        System.out.println("Diretorio Renomeado "+isDiretorioRenomeado);
    }
}
