package exercicios;

import java.util.Scanner;

public class CalculosAritimeticos {
    public static void main(String[] args) {
        // Instanciando a classe Scanner
        Scanner sc = new Scanner(System.in);

        // recebendo o primeiro número inteiro
        System.out.println("Informe o primeiro número:");
        int numero_1 = sc.nextInt();

        // recebendo o segundo número inteiro
        System.out.println("Informe o segundo número");
        int numero_2 = sc.nextInt();

        // somando os números
        System.out.println(numero_1 + " + " + numero_2 + "=" + (numero_1 + numero_2));

        // subtraindo os números
        System.out.println(numero_1 + " - " + numero_2 + "=" + (numero_1 - numero_2));

        // multiplicando os números
        System.out.println(numero_1 + " * " + numero_2 + "=" + (numero_1 * numero_2));

        // dividindo os números
        System.out.println(numero_1 + " / " + numero_2 + "=" + (numero_1 / numero_2));

        // calculando o resto da divisão
        System.out.println(numero_1 + " mod " + numero_2 + "=" + (numero_1 % numero_2));

    }
}
