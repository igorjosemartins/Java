package operadores;
/*
Neste código você verá exemplo de como utilizar operadores relacionais cuja saída sempre será true ou false
 */

public class OperadoresRelacionais {
    public static void main(String[] args) {
        String nome_1 = "Márcia";
        String nome_2 = "Francisco";
        int numero_1 = 200;
        int numero_2 = 198;
        float valor = 185.50f;
        boolean valido = true;

        System.out.println("a vogal a é igual a vogal e? " + nome_1 == nome_2);
        System.out.println("O número 200 é menor do que 198? " + (numero_1 > numero_2));
        System.out.println("185.50 é menor ou igual a 185.00? " + (valor <= 185.00));
        System.out.println("O valor é valido? " + (valido == true));

    }
}
