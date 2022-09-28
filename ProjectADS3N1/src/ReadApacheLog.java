import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadApacheLog {

    public static void main(String[] args) throws IOException {

        // Retorna o diretório raiz do projeto, neste caso o "ProjectADSN1"
        String atual_dir = System.getProperty("user.dir");

        // Local onde se encontra o arquivo a ser lido
        String file_origem = "\\src\\files\\apache.log";

        // Local onde se encontra será salvo o arquivo de destino
        String file_destino = "\\src\\files\\apache_erro.log";

        // Concatenando o diretório raiz do projeto com o diretório onde se encontra o arquivo
        String path_origem = atual_dir + file_origem;

        // Concatenando o diretório raiz do projeto com o diretório onde será salvo o arquivo
        String path_destino = atual_dir + file_destino;

        // Definir o encoding do arquivo, se não conhecermos o encoding, podemos usar o encoding default
        Charset encoding = Charset.defaultCharset();

        // Usamos a classe File com o método readAllLines
        // O método readAllLines recebe como parâmetro o caminho onde o arquivo se encontra
        // O resultado é uma lista com cada uma das linhas do arquivo
        List<String> lines = Files.readAllLines(Paths.get(path_origem), encoding);

        // Cria um objeto que permite a criação de um novo arquivo no caminho informado
        FileWriter output = new FileWriter(path_destino);

        // ================= RESOLUÇÃO INÍCIO =======================

        /*
            - ler o arquivo linha a linha e identificar as linhas de erro (possuem o termo "erro")

            - cada linha identificada deve ser escrita em um novo arquivo "apache_erro.log"

            - após salvar todos os registros no arquivo o sistema deve emitir a mensagem:
                - "Arquivo gerado com sucesso - foram encontrados n ERROS no arquivo de log"

            - obter:
                - número da linha
                - hora, minutos e segundos
                - descrição do erro
        */

        String erro = "error";

        int numberLine = 0, qtdErro = 0;

        String line, hour, contentError, result;

        // loop pra ler todas as linhas
        for (String l : lines) {

            // contador de linhas
            numberLine += 1;

            // se na linha contém "error"
            if (l.contains(erro)) {

                // contador de erros
                qtdErro += 1;

                // converte o valor do contador de linhas para uma string
                line = String.valueOf(numberLine);

                // usamos "substring" pois l já é uma String, e temos que pegar justamente o conteúdo dentro dela
                // que recebe dois parâmetros, os caracteres de 12 a 20
                hour = l.substring(12, 20);

                // mesma coisa, porém agora usamos o tamanho da linha como segundo parâmetro,
                // pois o tamanho do final da linha varia por linha, então não sabemos quando termina
                contentError = l.substring(27, l.length());

                // resultado = concatenamos todas as informações para mostrar ao usuário
                result = line + " - " + hour + " - " + contentError + "\n";

                try {
                    // Escreve o arquivo no disco passando o conteúdo para o novo arquivo
                    output.write(result);
                }
                catch (Exception e) {
                    e.getStackTrace();
                }
            }
        }
        // mensagem após salvar os registros com a quantidade de erro
        output.write("\nArquivo gerado com sucesso - foram encontrados " + qtdErro + " ERROS no arquivo de log");
        // fechamos o arquivo
        output.close();
        // ================= RESOLUÇÃO FIM =======================
    }
}