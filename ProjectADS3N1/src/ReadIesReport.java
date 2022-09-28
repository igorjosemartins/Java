import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class ReadIesReport {
    public static void main(String[] args) throws IOException {

        // Retorna o diretório raiz do projeto, neste caso o "ProjectADS3N1"
        String atual_dir = System.getProperty("user.dir");

        // Local onde se encontra o arquivo a ser lido
        String file_origem = "\\src\\files\\ies_report.txt";

        // Concatenando o diretório raiz do projeto com o diretório onde se encontra o arquivo
        String path_origem = atual_dir + file_origem;

        // Definir o encoding do arquivo, se não conhecermos o encoding, podemos usar o encoding default
        Charset encoding = Charset.defaultCharset();

        // Usamos a classe File com o método readAllLines
        // O método readAllLines recebe como parâmetro o caminho onde o arquivo se encontra
        // O resultado é uma lista com cada uma das linhas do arquivo
        List<String> lines = Files.readAllLines(Paths.get(path_origem), encoding);

        // ================= RESOLUÇÃO INÍCIO =======================

        /*
            - identificar quais universidades emitiram certificados (emissão > 0)
            - apresentar na tela o nome da universidade e a quantidade de certificados

            - obter:
                - nome universidade
                - quantidade certificados
         */

        String universidade;

        int numberLine = 0, certificados, positionCertificado, positionUniversidade;

        for (String l: lines) {
            // contador de linha
            numberLine += 1;

            // pulando a primeira linha porque não tem dados
            if (numberLine > 1) {

                // universidade
                // pegar a primeira vírgula (pois o nome das universidades está antes da primeira vírgula)
                positionUniversidade = l.indexOf(",");
                // pegar o conteúdo antes da primeira vírgula e retirar as aspas
                universidade = l.substring(0, positionUniversidade - 1).replace("\"", "");

                // certificados
                // pegar a última vírgula (pois o número de certificados está após a última vírgula)
                positionCertificado = l.lastIndexOf(",");
                // pegar o conteúdo após a última vírgula e transformá-los em inteiro
                certificados = Integer.parseInt(l.substring(positionCertificado + 1, l.length()));

                // se o valor dos certificados for diferente de 0
                if (certificados != 0) {
                    // mostra a mensagem
                    String message = "Universidade " + universidade + " - " + certificados + " certificados emitidos";
                    System.out.println(message);
                }
            }
        }
        // ================= RESOLUÇÃO FIM =======================
    }
}
