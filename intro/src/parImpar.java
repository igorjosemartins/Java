import java.util.Scanner;

public class parImpar {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("O número " + number + " é par.");
        }
        else {
            System.out.println("O número " + number + " é ímpar.");
        }
    }
}
