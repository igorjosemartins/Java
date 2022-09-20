// Escreva um programa capaz de calcular a área de um triângulo qualquer.
// O programa deve receber o tamanho dos três lados do triângulo e em seguida apresentar a área do triângulo.
// Se os valores não formarem um triângulo válido, o usuário deve ser comunicado.

// * Fórmula de Heron

import java.util.Scanner;

public class calculoAreaTriangulo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("---------------------------------");
        System.out.println("Calculadora de área de triângulos");
        System.out.println("---------------------------------");

        System.out.println("Digite o tamanho do lado a: ");
        float a = scan.nextFloat();

        System.out.println("Digite o tamanho do lado b: ");
        float b = scan.nextFloat();

        System.out.println("Digite o tamanho do lado c: ");
        float c = scan.nextFloat();

        // Condição da existência de um triângulo:
        // | b - c | < a < b + c
        // | a - c | < b < a + c
        // | a - b | < c < a + b

        // Math.abs() = módulo de uma operação
        if (
            (Math.abs(b - c) < a) && (a < b + c) &&
            (Math.abs(a - c) < b) && (b < a + c) &&
            (Math.abs(a - b) < c) && (c < a + b)
        )
        {
            // Fórmula de Heron
            float p = (a + b + c) / 2;
            float area = (float) Math.sqrt( (p * (p - a)) * (p - b) * (p - c) );
            // Math.sqrt() = raiz quadrada

            System.out.printf("A área do triângulo é: %.2fm²", area);
        }
        else {
            System.out.println("Os valores inseridos não formam um triângulo.");
        }
    }
}