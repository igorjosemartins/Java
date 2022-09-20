package entrada_saida;

import java.util.Scanner;

/*
Neste código você verá exemplo de como utilizar a classe Scanner que permite a
entrada de dados por linha de comando
 */

public class ScannerLib {
    public static void main(String[] args) {

        // === SCANNER ===
        String nome_1;
        Scanner sc;

        System.out.println("======================");
        System.out.println("Informe o sem nome: ");
        System.out.println("======================");
        sc = new Scanner(System.in);
        nome_1 = sc.nextLine();
        System.out.println("======================");
        System.out.println("O nome informado foi: " + nome_1);
        System.out.println("======================");

    }
}
