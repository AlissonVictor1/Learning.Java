package academy.devddojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//Buffer é uma área de memória RAM temporária que armazena blocos de dados
public class BufferedReaderTest01 {
    public static void main(String[] args) {
        // Cria um objeto File que representa o arquivo "file.txt" no diretório atual
        // Importante: isso apenas cria uma referência ao arquivo, não abre nem cria o arquivo
        File file = new File("file.txt");

        // Inicia um bloco try-with-resources que garantirá o fechamento automático dos recursos
        // Este é um padrão moderno introduzido no Java 7 para gerenciar recursos que precisam ser fechados
        try (
                // Cria um FileReader que é a classe básica para leitura de caracteres de um arquivo
                // FileReader trabalha com caracteres individuais e não possui buffer
                FileReader fr = new FileReader(file);

                // Cria um BufferedReader que "envolve" o FileReader
                // BufferedReader adiciona um buffer (área de memória temporária) que torna a leitura muito mais eficiente
                // Em vez de acessar o disco para cada caractere, ele lê vários caracteres de uma vez para o buffer
                BufferedReader br = new BufferedReader(fr)) {

            // Declara uma variável String para armazenar cada linha lida do arquivo
            String linha;

            // Loop while que continuará executando até o final do arquivo
            // A expressão dentro do while faz três coisas simultaneamente:
            // 1. Chama br.readLine() para ler uma linha do arquivo
            // 2. Atribui essa linha à variável 'linha'
            // 3. Verifica se o resultado é diferente de null (o que indicaria o fim do arquivo)
            while((linha = br.readLine()) != null) {
                // Imprime a linha lida no console
                // readLine() já remove o caractere de quebra de linha, então System.out.println
                // adiciona uma nova quebra de linha na saída
                System.out.println(linha);
            }

            // Fim do bloco try - os recursos (br e fr) serão automaticamente fechados aqui
            // mesmo se ocorrer uma exceção
            // Isso acontece porque FileReader e BufferedReader implementam a interface Closeable

        } catch (IOException e) {
            // Captura e trata qualquer exceção de entrada/saída que possa ocorrer
            // Por exemplo: arquivo não encontrado, problemas de permissão, etc.
            // printStackTrace() imprime o rastreamento da pilha de exceções no console
            // Em código de produção, você geralmente faria um tratamento mais específico
            e.printStackTrace();
        }
        // Neste ponto, mesmo se o try-catch terminar normalmente ou com exceção,
        // os recursos BufferedReader e FileReader já terão sido fechados automaticamente
    }
}
