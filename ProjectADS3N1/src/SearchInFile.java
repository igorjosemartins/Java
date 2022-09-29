import javax.swing.*;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class SearchInFile {

    public static void main(String[] args) throws IOException {

        // Retorna o diretório raiz do projeto, neste caso o "ProjectADSN1"
        String atual_dir = System.getProperty("user.dir");

        // Local onde se encontra o arquivo a ser lido
        String file_origem = "\\src\\files\\compilation.txt";

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
            - caixa de diálogo (JOptionPane) para que o usuário informe uma palavra para busca
            - a palavra deve conter três ou mais caracteres
                - caso tenha menos de 3:
                    - “A palavra deve possuir 3 ou mais caracteres!”
                    - deve se repetir até o usuário informar uma palavra com mais de 3
            - retornar uma janela com as linhas onde a palavra foi encontrada, juntamente com o parágrafo
            - caso não haja resultado:
                - "Nenhum resultado foi encontrado."
         */

        String word, result = "";

        int numberLine = 0, count = 0;

        // perguntar pro usuário uma primeira vez
        do {
            word = JOptionPane.showInputDialog("Informe uma palavra para busca:");

            if(word.length() <3 ) {
                JOptionPane.showMessageDialog(null,"A palavra deve possuir 3 ou mais caracteres!");
            }
        } // perguntar até que a resposta tenha no mínimo 3 caracteres
        while (word.length() < 3);

        // loop p percorrer as linhas
        for (String l : lines) {

            // contador das linhas
            numberLine += 1;

            // se na linha tiver a palavra pesquisada
            if (l.contains(word)) {

                // parágrafo + conteúdo da linha
                result += numberLine + " - " + l + "\n\n";

                // contador p mostrar que entrou na condição
                count++;
            }
        }

        // se não entrou na condição = mostra a mensagem de erro
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum resultado foi encontrado.");
        }
        // se entrou = mostra o resultado
        else {
            JOptionPane.showMessageDialog(null, result);
        }
        // ================= RESOLUÇÃO FIM =======================
    }
}
