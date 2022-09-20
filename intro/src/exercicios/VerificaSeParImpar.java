package exercicios;

import java.util.Scanner;

public class VerificaSeParImpar {
    public static void main(String[] args) {

        // instanciando a classe Scanner
        Scanner sc = new Scanner(System.in);

        // recebendo um número
        System.out.println("Informe um número:");
        int number = Integer.parseInt(sc.nextLine());
        int x = number % 2;

        // verificando se o número é par ou impar
        if(x == 0){
            System.out.println("O número é par.");
        }
        else{
            System.out.println("O número é impar.");
        }

    }
}
