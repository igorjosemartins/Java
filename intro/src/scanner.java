
import java.util.Scanner;

public class scanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um número: ");
        float x = scan.nextFloat();

        System.out.println("Digite outro número: ");
        float y = scan.nextFloat();

        float sum = x + y;

        float sub = x - y;

        float div = x / y;

        float multi = x * y;

        float rest = x % y;

        System.out.println("Soma dos números: " + sum);
        System.out.println("Subtração dos números: " + sub);
        System.out.println("Divisão dos números: " + div);
        System.out.println("Multiplicação dos números: " + multi);
        System.out.println("Resto da divisão dos números: " + rest);
    }
}


