package operadores;
/*
Neste código você verá exemplos de operadores aritméticos e como pode utilizá-los
 */
public class OperadoresAritmeticos {
    public static void main(String[] args) {

        // declaração e inicialização de variáveis
        int x = 10;
        int y = 3;

        // operações aritméticas com as variáveis
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("-x = " + (-x));
        System.out.println("x/y =" + (x / y));
        System.out.println("Resto de x por y = " + (x % y)); // resultado igual a 1
        System.out.println("Inteiro de x por y = " + (int)(x / y));
        System.out.println("x + 1 = " + (++x));
    }
}
