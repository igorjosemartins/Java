package variaveis_constantes;

/*
Neste código você encontrará exemplos de como declarar variáveis e constantes, além de ver exemplos de variáveis
de tipos primitivos do Java e como concatenar (juntar) uma variável com um texto.
 */

import java.util.Scanner;

public class VariaveisConstantes {
    public static void main(String[] args) {

        // === DECLARAÇÃO DE VARIÁVEIS ===
        // Quando usamos o tipo char devemos usar aspas simples para indicar que o tipo é char e não "string"
        char sexo = 'f';
        byte idade = 55;
        short codigo = 342;
        float nota = 9.4f;
        int alunos = 150, classes = 10;
        long habitantes = 9050100;
        double dolar = 5.65;
        boolean alternativa = false;

        System.out.println("sexo: " + sexo + " idade: " + idade + " código: " + codigo);
        System.out.println("nota: " + nota + " alunos: " + alunos + " classes: " + classes);
        System.out.println("habitantes: " + habitantes + " dolar: " + dolar + " alternativa: " + alternativa);

        // === DECLARAÇÃO DE CONSTANTES ===
        final double PI = 3.14;
        final int MILISEGUNDOS_POR_SEGUNDO = 1000;

        System.out.println("valor de PI: " + PI);
        System.out.println("milisegundos por segundo: " + MILISEGUNDOS_POR_SEGUNDO);
    }
}
