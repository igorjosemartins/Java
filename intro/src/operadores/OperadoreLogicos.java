package operadores;

/*
Neste código você verá um exemplo de utilização de operadores lógicos
 */

public class OperadoreLogicos {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;

        // === OPERADOR AND
        if ((verdadeiro == true) && (falso == true)){
            System.out.println("o resultado da afirmativa é verdadeira");
        }else{
            System.out.println("o resultado da afirmativa é falsa");
        }

        // === OPERADOR OR
        if ((verdadeiro == true) || (falso == true)){
            System.out.println("o resultado da afirmativa é verdadeira");
        }else{
            System.out.println("o resultado da afirmativa é falsa");
        }

        // === OPERADOR NOT
        if ((verdadeiro == true) && !(falso == true)){
            System.out.println("o resultado da afirmativa é verdadeira");
        }else{
            System.out.println("o resultado da afirmativa é falsa");
        }
    }
}
