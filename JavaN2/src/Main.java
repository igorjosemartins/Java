import produtos.Pastel;
import produtos.Produto;
import produtos.Suco;
import telas.Tela;
import vendas.Venda;

import java.util.Scanner;

public class Main extends Tela {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Tela tela = new Tela();

        Venda venda = new Venda();

        Produto prod = new Produto();

        Pastel pastel = new Pastel("carne");

        Suco suco = new Suco("laranja");

        tela.menuPrincipal();
        String opc = sc.nextLine();

        if(opc.equals("1")) {
            tela.menuPastel();
        }
        if(opc.equals("2")) {
            tela.menuSuco();
        }
        else {
            tela.encerrarPrograma();
        }
    }
}
