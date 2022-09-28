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

        String word, wordFounded, result;

        int numberLine = 0, lineFounded = 0, count = 0;

        do {
            word = JOptionPane.showInputDialog("Informe uma palavra para busca:");

            if(word.length() <3 ) {
                JOptionPane.showMessageDialog(null,"A palavra deve possuir 3 ou mais caracteres!");
            }
        }
        while (word.length() < 3);

        for (String l : lines) {

            numberLine += 1;

            if (l.contains(word)) {
                // pegar as linhas
                wordFounded = l;
                // pegar o número da linha
                lineFounded = numberLine;

                result = lineFounded + " - " + l;

                JOptionPane.showMessageDialog(null, result);

                // contador para depois conseguirmos mostrar que a palavra pesquisada não foi encontrada
                count++;
            }
        }
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Nenhum resultado foi encontrado.");
        }

        // ================= RESOLUÇÃO FIM =======================
    }
}
