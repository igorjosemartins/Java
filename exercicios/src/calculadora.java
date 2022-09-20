import javax.swing.*;

public class calculadora {

    public static void main(String[] args) {

        String opc = JOptionPane.showInputDialog(
                "Informe um dos operadores:" +
                "\n +" +
                "\n -" +
                "\n /" +
                "\n *");

        if(!opc.equals("+") && !opc.equals("-") && !opc.equals("/") && !opc.equals("*")) {
            JOptionPane.showMessageDialog(null,"Operador inválido");
            System.exit(0);
        }

        float number1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número: "));

        float number2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número: "));

        float calculate;

        switch(opc) {
            case "+":
                calculate = number1 + number2;
                JOptionPane.showMessageDialog(null, number1 + " " + opc + " " + number2 + " " + "=" + " " + calculate);
                break;

            case "-":
                calculate = number1 - number2;
                JOptionPane.showMessageDialog(null, number1 + " " + opc + " " + number2 + " " + "=" + " " + calculate);
                break;

            case "/":
                calculate = number1 / number2;
                JOptionPane.showMessageDialog(null, number1 + " " + opc + " " + number2 + " " + "=" + " " + calculate);
                break;

            case "*":
                calculate = number1 * number2;
                JOptionPane.showMessageDialog(null, number1 + " " + opc + " " + number2 + " " + "=" + " " + calculate);
                break;
        }
    }
}