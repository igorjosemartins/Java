
// Exercicio 1

// Escreva um programa que solicite ao usuário que informe 4 números.
// Em seguida, o programa deve verificar se os 4 números são iguais e informar o usuário.

import javax.swing.*;

public class verificaIgualdade {
    public static void main(String[] args) {

        int number1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro número:"));

        int number2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo número:"));

        int number3 = Integer.parseInt(JOptionPane.showInputDialog("Informe o terceiro número:"));

        int number4 = Integer.parseInt(JOptionPane.showInputDialog("Informe o quarto número:"));

        if (number1 == number2 && number1 == number3 && number1 == number4) {
          JOptionPane.showMessageDialog(null, "Os 4 números são iguais.");
        }
        else {
            JOptionPane.showMessageDialog(null,"Os números são diferentes.");
        }
    }
}
