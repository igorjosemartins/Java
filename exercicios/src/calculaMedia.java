
// Exercicio 2

// Escreva um programa que calcule a média de uma quantidade
// específica de números, seguindo os seguintes passos:

//   1. O programa deve primeiramente solicitar ao usuário que informe quantos números
//      serão utilizadas para calcular a média;
//
//   2. O programa deve solicitar ao usuário tantos números quantos for a quantidade de números informada;
//
//   3. O programa irá calcular a média e apresentar o resultado.


import java.util.Scanner;

public class calculaMedia {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas serão utilizadas para o cálculo da média ?");
        int mediaLength = Integer.parseInt(scan.nextLine());

        System.out.println();

        float mediaSum = 0;

        for(int i = 0; i < mediaLength; i++) {

            System.out.println("Insira sua nota: ");
            float mediaNumbers = (scan.nextFloat());

            mediaSum += mediaNumbers;
        }

        float media = mediaSum / mediaLength;

        System.out.printf("Sua média é: %.2f", media);
    }
}